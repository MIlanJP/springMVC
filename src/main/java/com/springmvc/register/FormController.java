package com.springmvc.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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


}
