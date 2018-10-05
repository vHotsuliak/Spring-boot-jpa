package com.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController {


    @RequestMapping("/{str}")
    public String homePage(@PathVariable String str) {
        return str;
    }
}
