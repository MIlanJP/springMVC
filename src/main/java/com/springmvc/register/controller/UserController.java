package com.springmvc.register.controller;

import com.springmvc.register.model.User;
import com.springmvc.register.model.UserDao;
import com.springmvc.register.services.UserService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public  class UserController {
    Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

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


    @RequestMapping("/gotoLoginPage")
    public String loginPage(@Valid @ModelAttribute("user")User user ,BindingResult bindingresult,HttpServletRequest req) {
        if(bindingresult.hasErrors()){
            return "user-Registration-form";
        }else {
            user.setPassword( req.getParameter("pass"));
            userService.insert(user);
            return "login-form";
            }
        }
    @RequestMapping("/redirectToLoginPage")
    public String redirectToLoginPage() {
        return "login-form";
    }

    @RequestMapping("redirectToProfilePage")
    public String redirectToProfilePage(@ModelAttribute("user")User user ,HttpServletRequest req){
        user.setPassword(req.getParameter("pass"));
        if(userService.validateUser(user)){
            return "profilePage3";
        }else{
            return "login-form";
        }
    }


    @RequestMapping("logout")
    public String logout(){
            return "login-form";
    }

}


