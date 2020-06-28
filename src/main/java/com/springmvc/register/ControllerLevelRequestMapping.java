package com.springmvc.register;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/loggedin")
public class ControllerLevelRequestMapping {

    @RequestMapping("/displayform")
    public String displayForm(){
        System.out.println("Pringting from RequestMapper COntroller levbelg");
        return "login-form";
    }

    @RequestMapping("/profilePage3")
    public String displayform3(@RequestParam("uname")String username, Model model){
        model.addAttribute("message","Hey "+username);
        return "profilePage3";
    }

}
