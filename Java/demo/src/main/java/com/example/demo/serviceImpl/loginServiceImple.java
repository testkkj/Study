package com.example.demo.serviceImpl;

import com.example.demo.mapper.loginMapper;
import com.example.demo.service.loginService;

/**
 * loginServiceImple
 */
public class loginServiceImple implements loginService {
    loginMapper loginMapper;

    @Override
    public int login() throws Exception {
        int result = 0;
        
        try {
            result = loginMapper.login();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}