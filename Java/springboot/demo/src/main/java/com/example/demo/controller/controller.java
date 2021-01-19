package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.DTO.loginDto;
import com.example.demo.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @Autowired
    private loginService loginService;

    @RequestMapping("/hello.do")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/index.do")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/login.do")
    public String logincheck(loginDto loginDto, HttpServletRequest httpServletRequest) {
        int result = 0;

        try {
            result = loginService.logincheck(loginDto);
            System.out.println("==============================================================================================="+result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String msg = "";
        
        if (result == 1) {
            msg = "redirect:/hello.do";
        } else {
            msg = "redirect:/index.do";
        }
        return msg;
    }

}
