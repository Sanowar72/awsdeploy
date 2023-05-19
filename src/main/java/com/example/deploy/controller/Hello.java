package com.example.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/home")
    public String home(){
        return "im in home checking for deploye.....";
    }

    @GetMapping(value = "home2")
    public String home2(){
        return "this is home 2.......";
    }
}
