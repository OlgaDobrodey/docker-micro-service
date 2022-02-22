package com.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @GetMapping("/name")
    public String name() {
        return "Hello world";
    }
}
