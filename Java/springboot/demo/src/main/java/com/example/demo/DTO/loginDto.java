package com.example.demo.DTO;

import java.sql.Date;

import lombok.Data;

/**
 * loginVo
 */
@Data
public class loginDto {
    private int user_id;
    private String username;
    private String password;
    private String email;
    private Date created_on;
    private Date last_login;
}