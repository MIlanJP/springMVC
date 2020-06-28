package com.springmvc.register.controller;

import com.springmvc.register.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public  class UserController {

    @RequestMapping("/register")
    public String getDetails(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "user-Registration-form";
    }

    @ResponseBody
    @RequestMapping("/processform")
    public String processForm(@ModelAttribute("user")User user) {
        user.getFirstName();
        user.getLastName();
        user.getUsername();
        return  user.getFirstName()+
        user.getLastName()+
        user.getUsername()+
                user.getCountry();
    }


}
