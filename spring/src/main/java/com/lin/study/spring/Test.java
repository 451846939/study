package com.lin.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Test {
    @Bean
    public RestTemplate creat(){
        return new RestTemplate();
    }

}
