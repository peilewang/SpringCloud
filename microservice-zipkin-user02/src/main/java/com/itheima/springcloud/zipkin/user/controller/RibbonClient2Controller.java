package com.itheima.springcloud.zipkin.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonClient2Controller {
    private static Logger logger = LoggerFactory.getLogger(RibbonClient2Controller.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon-client-2")
    public String test() {
        logger.info("RibbonClient2Controller--test() is requesting....");
        return restTemplate.getForObject("http://microservice-zipkin-user/callRabbitClient1", String.class);
    }

    @RequestMapping("/callRabbitClient2")
    public String callRabbitClient2() {
        logger.info("RibbonClient2Controller--callRabbitClient2 is requesting...");
        return "hello ,Spring Cloud Sleuth!";
    }
}
