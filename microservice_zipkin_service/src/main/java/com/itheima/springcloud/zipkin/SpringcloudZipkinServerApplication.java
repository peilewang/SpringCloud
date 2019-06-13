package com.itheima.springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableZipkinServer: 开启zipkinServer的功能
@EnableZipkinServer
public class SpringcloudZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZipkinServerApplication.class, args);
    }
}
