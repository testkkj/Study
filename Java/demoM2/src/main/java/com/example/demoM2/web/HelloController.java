package com.example.demoM2.web;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    
}