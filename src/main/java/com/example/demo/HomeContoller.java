package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
    @RequestMapping("/")
    public String login() {
        return "login";
    }


    @RequestMapping("/welcome")
    public String welcome (){
        return "welcome";
    }
}



