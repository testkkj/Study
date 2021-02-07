package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * loginMapper
 */
@Mapper
public interface loginMapper {
    public int login() throws Exception;
}