package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AppBean appBean(){
        AppBean appBean = new AppBean();
        appBean.hello();
        return appBean;
    }
}
