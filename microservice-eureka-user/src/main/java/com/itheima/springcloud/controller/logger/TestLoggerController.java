package com.itheima.springcloud.controller.logger;

import com.itheima.springcloud.entity.Sessions;
import com.itheima.springcloud.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/logger")
public class TestLoggerController {

    @Autowired
    private LoggerService loggerService;

    @GetMapping("/getLogers")
    public Map<String, Object> getLogers(@RequestParam(name = "id") Integer id) {
        Map<String, Object> map = new HashMap<>();
        Sessions sessions = loggerService.getsession(id);
        map.put("data", sessions);
        return map;
    }
}
