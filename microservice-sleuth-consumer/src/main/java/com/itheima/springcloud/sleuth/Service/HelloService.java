package com.itheima.springcloud.sleuth.Service;

import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="",url="")
public interface HelloService {
   @RequestMapping("sayHello")
    String sayHello(@RequestParam("name") String name);
}
