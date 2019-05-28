package com.itheima.springcloud.service;

import com.itheima.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    public User findById(Long id){
         return this.restTemplate.getForObject("http://microserice-eureka-user/"+id,User.class);
    }
}
