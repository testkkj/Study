package com.example.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * AccountBookController
 */
@Controller
public class AccountBookController {

    @RequestMapping("/demo/accountBook.do")
    public ModelAndView accountBookIndex() {
        ModelAndView modelAndView = new ModelAndView("demo/accountBook");
        return modelAndView;
    }

    @RequestMapping("/demo/accountBook1.do")
    public ModelAndView accountBookIndex1() {
        ModelAndView modelAndView = new ModelAndView("demo/accountBook1");
        return modelAndView;
    }
}