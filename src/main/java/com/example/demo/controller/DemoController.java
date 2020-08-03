package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName DemoController
 *@Description
 *@Author 白云
 *@Date 2020/7/2
 **/

@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Value("${spring.name}")
    private String name;

    @GetMapping("/hello")
    public String demo(){
        return "hello world:" + name;
    }
}
