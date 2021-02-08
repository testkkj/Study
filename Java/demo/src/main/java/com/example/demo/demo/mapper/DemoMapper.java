package com.example.demo.demo.mapper;

import java.util.List;

import com.example.demo.demo.dto.DemoDto;

import org.apache.ibatis.annotations.Mapper;

/**
 * DemoMapper
 */
@Mapper
public interface DemoMapper {

    List<DemoDto> selectBoardList() throws Exception;
}