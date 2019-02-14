package com.setsail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.print("你妹的，，llldd");
        return "hello";
    }
}
