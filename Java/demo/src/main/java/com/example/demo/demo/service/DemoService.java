package com.example.demo.demo.service;

import java.util.List;

import com.example.demo.demo.dto.DemoDto;

/**
 * DemoService
 */
public interface DemoService {

    List<DemoDto> selectBoardList() throws Exception;
    
}