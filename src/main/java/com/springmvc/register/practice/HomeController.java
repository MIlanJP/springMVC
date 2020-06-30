package com.springmvc.register.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Component
public class HomeController {

    @RequestMapping("/home")
    public String displayPage(){
        return "hello-world";
    }

}
