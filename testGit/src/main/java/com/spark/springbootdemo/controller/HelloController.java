package com.spark.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(){
        return "hello, spark6.";
    }
}
