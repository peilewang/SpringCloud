package com.itheima.springcloud.sleuth.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Configuration
public class ConsumerConfiguration {
    @Autowired
    BeanFactory beanFactory;
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    /*@Bean
    public ExecutorService executorService(){
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        return new TraceableExecutorService(this.beanFactory,executorService,"calculateTax",null);
    }*/
}
