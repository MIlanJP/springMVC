package com.springmvc.register.controller;

import com.springmvc.register.model.User;
import com.springmvc.register.model.UserJDBCDao;
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

    @Autowired
    UserJDBCDao userJDBCDao;

    @InitBinder
    public void initBInder(WebDataBinder databinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        databinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/")
    public String getDetails(Model model ,HttpServletRequest req){
        User user=new User();
        user.setPassword( req.getParameter("pass"));
        model.addAttribute("user",user);

        return "user-Registration-form";
    }


    @RequestMapping("/processform")
    public String processForm(@Valid @ModelAttribute("user")User user ,BindingResult bindingresult) {
        if(bindingresult.hasErrors()){
            return "user-Registration-form";
        }else{
            return  "profilePage2";
        }
    }


}
