package com.JWTSecurity.demoSecurity.Controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HElloController {

    @GetMapping("hello")
    public String greet(){
        return "hi guys";
    }

    @GetMapping("/")
    public String home(HttpServletRequest request) {   //request is not object , which is pointing to onject
        return "welcome to spring boot" + request.getSession().getId();    // to print session id
    }
}

