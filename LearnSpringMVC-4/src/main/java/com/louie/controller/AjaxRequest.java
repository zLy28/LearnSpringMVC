package com.louie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxRequest {
    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
}
