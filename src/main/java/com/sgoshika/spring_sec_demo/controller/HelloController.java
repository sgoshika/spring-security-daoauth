package com.sgoshika.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greetings(HttpServletRequest request){
        return "**** This is from local machine ---> Hello World "+request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "About the company: Enter Details here "+request.getSession().getId();
    }

    @GetMapping("getCSRF")
    public CsrfToken getCSRF(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
