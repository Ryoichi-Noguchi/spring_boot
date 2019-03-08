package com.example.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {

    @After("within(com.example.demo.aop.AopDemoController)")
    public void logTest1(){
        System.out.println("after");
    }

    @Before("within(com.example.demo.aop.AopDemoController)")
    public void logTest2(){
        System.out.println("before");
    }
}
