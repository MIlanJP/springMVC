package com.springmvc.register.controller;

import com.springmvc.register.model.HUser;
import com.springmvc.register.model.User;
import com.springmvc.register.services.HibernateUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.sql.SQLIntegrityConstraintViolationException;

@SessionAttributes("username")
@Controller
@RequestMapping("/userhibernate")
public  class UserHibernateController {
    Logger logger= LoggerFactory.getLogger(UserHibernateController.class);

    @Autowired
    HibernateUserService hibernateUserService;

    @InitBinder
    public void initBInder(WebDataBinder databinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        databinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping(value={"/","/redirectToRegisterPage"})
    public String getDetails(Model model ){
        User user=new User();
        model.addAttribute("user",user);
        logger.toString();
        return "user-Registration-form";
    }

//Request from Register page after registration is sucessfull
//    And switch to register page back if not sucessfull
    @RequestMapping("/gotoLoginPage")
    public String loginPage(@Valid @ModelAttribute("user") HUser user , BindingResult bindingresult, HttpServletRequest req,
                            HttpSession session)  {

        boolean status=false;
        if(bindingresult.hasErrors()){
            return "user-Registration-form";
        }
        user.setPassword( req.getParameter("pass"));
        status=hibernateUserService.insertUser(user);
        if(status) {
            req.setAttribute("eMessage","You have Sucessfully Registered");
            return "login-form";
        }
        req.setAttribute("eMessage","Username already Taken");
        return "user-Registration-form";
    }

//        Request from switch to login page from register page
    @RequestMapping("/redirectToLoginPage")
    public String redirectToLoginPage() {
        return "login-form";
    }

//    Request from login form
    @RequestMapping("/redirectToProfilePage")
    public String redirectToProfilePageFromLogin(@ModelAttribute("user") HUser user , HttpServletRequest req, ModelMap map,
                                                 HttpSession session){
        if(session.getAttribute("username")!=null){
            return "profilePage3";
        }
        user.setPassword(req.getParameter("pass"));
        if(hibernateUserService.validateUser(user.getUsername())!=0){
            map.put("username",user.getUsername()+" Saved From Session");
            return "profilePage3";
        }
        req.setAttribute("eMessage","Login With Correct Credentails");
        return "login-form";
    }

    @RequestMapping("/profilePage")
    public String redirectToProfilePage(){
        return "profilePage3";
    }


    @RequestMapping("/logout")
    public String logout(HttpSession session,HttpServletRequest req){
        session.invalidate();
        req.setAttribute("eMessage","You have Logged Out Sucessfully");
        return "login-form";
    }

}


