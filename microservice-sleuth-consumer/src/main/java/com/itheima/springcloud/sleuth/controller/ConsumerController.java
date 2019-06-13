package com.itheima.springcloud.sleuth.controller;

import com.itheima.springcloud.sleuth.Service.HelloService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {
    private static final Logger log= org.slf4j.LoggerFactory.getLogger(ConsumerController.class);
    @Autowired
    private HelloService helloService;
    @Autowired
    private RestTemplate restTemplate;

}
