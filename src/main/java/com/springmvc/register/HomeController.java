package com.springmvc.register;

import com.springmvc.register.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Component
public class HomeController {

    @RequestMapping("/home")
    public String displayPage(){
        return "hello-world";
    }

}
