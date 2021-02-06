package com.example.demo.controller;

import com.example.demo.serviceImpl.loginServiceImple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * controller
 */
@Controller
public class controller {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login.do")
    public String login() {
        loginServiceImple loginServiceImple = new loginServiceImple();
        int result = 0;

        try {
            result = loginServiceImple.login();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result == 0) {
            return "index.do";
        } else {
            return "loginsuccess.do";
        }
        
    }
}