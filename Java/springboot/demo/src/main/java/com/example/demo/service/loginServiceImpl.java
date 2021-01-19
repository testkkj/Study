package com.example.demo.service;

import com.example.demo.DTO.loginDto;
import com.example.demo.mapper.loginMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * loginImpl
 */
@Service
public class loginServiceImpl implements loginService {
    @Autowired
    private loginMapper loginMapper;

    @Override
    public int logincheck(loginDto loginDto) throws Exception {
        
        return loginMapper.logincheck(loginDto);
    }
}