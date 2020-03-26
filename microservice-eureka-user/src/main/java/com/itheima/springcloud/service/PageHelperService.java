package com.itheima.springcloud.service;

import com.itheima.springcloud.entity.Sessions;

import java.sql.Date;
import java.util.List;

public interface PageHelperService {
    List<Sessions> getSessions(Date starttime, Date endtime, String usr,Integer pageNum,Integer pageSize);
}
