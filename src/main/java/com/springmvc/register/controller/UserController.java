package com.springmvc.register.controller;

import com.springmvc.register.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public  class UserController {

    @RequestMapping("/register")
    public String getDetails(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "user-Registration-form";
    }

}
