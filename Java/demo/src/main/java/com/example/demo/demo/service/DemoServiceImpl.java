package com.example.demo.demo.service;

import java.util.List;

import com.example.demo.demo.dto.DemoDto;
import com.example.demo.demo.mapper.DemoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DemoServiceImpl
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<DemoDto> selectBoardList() throws Exception {
        return demoMapper.selectBoardList();
    }

    @Override
    public void insertBoard(DemoDto demoDto) throws Exception {
        demoMapper.insertBoard(demoDto);
    }
    
}