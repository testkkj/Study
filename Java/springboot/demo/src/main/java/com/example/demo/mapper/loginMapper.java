package com.example.demo.mapper;

import com.example.demo.DTO.loginDto;

import org.apache.ibatis.annotations.Mapper;

/**
 * login
 */
@Mapper
public interface loginMapper {
    int logincheck(loginDto loginDto) throws Exception;
}