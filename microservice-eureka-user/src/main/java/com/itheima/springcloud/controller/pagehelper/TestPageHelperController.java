package com.itheima.springcloud.controller.pagehelper;

import com.github.pagehelper.Page;
import com.itheima.springcloud.entity.CommonResponse;
import com.itheima.springcloud.entity.Sessions;
import com.itheima.springcloud.service.PageHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/page")
public class TestPageHelperController {
    @Autowired
    private PageHelperService pageHelperService;

    @GetMapping("/sessions")
    CommonResponse<Map<String, Object>> getSessions(@RequestParam(value = "starttime", required = false) Date starttime, @RequestParam(value = "endtime", required = false) Date endtime, @RequestParam(value = "usr", required = false) String usr, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        Map<String, Object> map = new HashMap<>();
        Page<Sessions> page = (Page<Sessions>) pageHelperService.getSessions(starttime, endtime, usr, pageNum, pageSize);
        map.put("data", page.getResult());
        map.put("total", page.getTotal());
        return CommonResponse.successResponse(map);
    }

}
