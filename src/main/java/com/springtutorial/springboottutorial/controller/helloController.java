package com.springtutorial.springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/")
    public String helloworld(){
        return "Hello there general Lie Reload";
    }

}
