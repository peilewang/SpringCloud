package com.itheima.springcloud.feign.hystrix.service;

import com.itheima.springcloud.feign.hystrix.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
 public class HystrixClientFallback implements UserFeignClient {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);
    /**
     * hystrix fallback⽅法
     * @param id id
     * @return 默认的⽤户
     */
    @Override
    public User findByIdFeign(Long id) {
        HystrixClientFallback.LOGGER.info("异常发⽣，进⼊fallback 方法，接收的参数：id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}


