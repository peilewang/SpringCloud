package com.itheima.springcloud.hystrix.service;

import com.itheima.springcloud.hystrix.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class RibbonHystrixService {
    @Autowired
    private RestTemplate restTemplate;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);
    /**
     * 使⽤@HystrixCommand注解指定当该⽅法发⽣异常时调⽤的⽅法
     * @param id id
     * @return 通过id查询到的⽤户
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id){
       return  this.restTemplate.getForObject("http://microserice-eureka-user/"+id,User.class);
    }
    /**
     * hystrix fallback⽅法
     * @param id id
     * @return 默认的⽤户
     */
    public User fallback(Long id){
        RibbonHystrixService.LOGGER.info("异常发生，进入fallback方法，接收的参数：id={}"+id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
