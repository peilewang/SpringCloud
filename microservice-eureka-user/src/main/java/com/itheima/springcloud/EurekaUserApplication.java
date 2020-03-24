package com.itheima.springcloud;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableSwagger2Doc
@EnableAutoConfiguration
@MapperScan("com.itheima.springcloud.mapper")
public class EurekaUserApplication {
    @RequestMapping("/hello")
    public String home(){
        return "hello world";
    }
    public static void main(String[] args){
         SpringApplication.run(EurekaUserApplication.class,args);
    }

}
