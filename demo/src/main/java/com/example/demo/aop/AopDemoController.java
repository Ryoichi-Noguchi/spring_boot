package com.example.demo.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopDemoController {

    @RequestMapping("/test1")
    public String input1(){
        return "test1";
    }
}
