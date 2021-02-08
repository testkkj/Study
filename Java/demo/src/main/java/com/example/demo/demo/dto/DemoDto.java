package com.example.demo.demo.dto;

import lombok.Data;

/**
 * DemoDto
 */
@Data
public class DemoDto {

    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private String createdDatetime;
    private String updaterId;
    private String updatedDatetime;
    
}