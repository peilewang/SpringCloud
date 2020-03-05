package com.itheima.springcloud;
import com.itheima.springcloud.entity.User;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableSwagger2Doc
@EnableAutoConfiguration
public class EurekaUserApplication {
    @RequestMapping("/hello")
    public String home(){
        return "hello world";
    }
    public static void main(String[] args){
         SpringApplication.run(EurekaUserApplication.class,args);
    }

}
