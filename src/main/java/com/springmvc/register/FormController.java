package com.springmvc.register;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@PropertySource("classpath:message.properties")
public class FormController {
//    Manages controls  to display initial form
    @RequestMapping("/displayform")
    public String displayForm(){
        return "login-form";
    }

    @RequestMapping("/profilePage")
    public String profilePage(){
        return "profilePage";
    }


    @RequestMapping("/profilePage2")
    public String displayform1(HttpServletRequest request, Model model){
        String message="Hey!!"+request.getParameter("uname");
        model.addAttribute("message",message);
        return "profilePage2";
    }

    @RequestMapping("/profilePage3")
    public String displayform3(@RequestParam("uname")String username, Model model){
        model.addAttribute("message","Hey "+username);
        return "profilePage3";
    }

}
