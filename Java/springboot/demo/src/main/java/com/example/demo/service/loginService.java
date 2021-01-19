package com.example.demo.service;

import com.example.demo.DTO.loginDto;

/**
 * login
 */
public interface loginService {
    int logincheck(loginDto loginDto) throws Exception;
}