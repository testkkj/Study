package com.example.demo.demo.controller;

import java.util.List;

import com.example.demo.demo.dto.DemoDto;
import com.example.demo.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * DemoController
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo/openBoardList.do")
    public ModelAndView openBoardList() throws Exception {
        ModelAndView modelAndView = new ModelAndView("/demo/boardList");

        List<DemoDto> list = demoService.selectBoardList();
        modelAndView.addObject("list", list);

        return modelAndView;
    }
}