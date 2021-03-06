package com.example.demo.demo.service;

import java.util.List;

import com.example.demo.demo.dto.DemoDto;

/**
 * DemoService
 */
public interface DemoService {

    List<DemoDto> selectBoardList() throws Exception;
    
    void insertBoard(DemoDto demoDto) throws Exception;

    DemoDto selectBoardDetail(int boardIdx) throws Exception;
}