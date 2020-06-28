package com.springmvc.register.controller;

import com.springmvc.register.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public  class UserController {

    @RequestMapping("/register")
    public String getDetails(Model model){
        User user=new User();
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
