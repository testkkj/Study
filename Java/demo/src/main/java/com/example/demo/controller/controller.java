package com.example.demo.controller;

import com.example.demo.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * controller
 */
@Controller
public class controller {
    @Autowired
    loginService loginService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login.do")
    public String login() {
        int result = 0;

        try {
            result = loginService.login();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result == 0) {
            return "index";
        } else {
            return "loginsuccess";
        }
        
    }
}