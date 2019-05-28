package com.itheima.springcloud.controller;

import com.itheima.springcloud.entity.User;
import com.itheima.springcloud.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;
    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return this.ribbonService.findById(id);
    }
}
