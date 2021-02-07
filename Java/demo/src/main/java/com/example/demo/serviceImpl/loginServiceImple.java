package com.example.demo.serviceImpl;

import com.example.demo.mapper.loginMapper;
import com.example.demo.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * loginServiceImple
 */
@Service
public class loginServiceImple implements loginService {
    @Autowired
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