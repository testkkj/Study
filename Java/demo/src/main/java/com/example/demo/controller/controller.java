package com.example.demo.controller;

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
}