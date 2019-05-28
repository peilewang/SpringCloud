package com.itheima.springcloud.feign.service;

import com.itheima.springcloud.feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.itheima.springcloud.feign.component.*;
/**
 * 使⽤@FeignClient("microservice-provider-user")注解绑定micros
 ervice-provider-user服务，还可以使⽤url参数指定⼀个URL。
 * @author eacdy
 */
//@FeignClient(name = "microserice-eureka-user")
@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)//feign熔断器
public interface UserFeignClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
