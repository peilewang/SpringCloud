package com.itheima.springcloud.controller;


import com.itheima.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
     * @RequestMapping(value = "/id", method = RequestMethod.GE
    T)
     * 类似的注解还有@PostMapping等等
     * @param
     * @return user信息
     */
    //Swagger2 解决 java.lang.NumberFormatException异常
   /* @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user=new User();
        user.setAge(12);
        user.setId(1l);
        user.setUsername("plw");
        return user;
    }*/
    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }
    @GetMapping("/getdd")
    public Map<String,Object> getexample(){
        Map<String,Object> map=new HashMap<>();
        List list=new ArrayList<>();
        User user=new User();
        user.setUsername("222");
        user.setId(2L);
        user.setAge(5);
        list.add(user);
        User user1=new User();
        user1.setUsername("111");
        user1.setId(2L);
        user1.setAge(5);
        list.add(user1);
        map.put("code","200");
        map.put("message","操作成功");
        map.put("data",list);
        map.put("user",user);
        return map;
    }
}
