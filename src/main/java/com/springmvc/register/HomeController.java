package com.springmvc.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@Component
public class HomeController {

    @RequestMapping("/")
    public String displayPage(){
        return "hello-world";
    }




}
