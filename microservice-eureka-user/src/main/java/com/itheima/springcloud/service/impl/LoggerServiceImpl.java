package com.itheima.springcloud.service.impl;

import com.itheima.springcloud.dao.Sessions;
import com.itheima.springcloud.mapper.SessionsMapper;
import com.itheima.springcloud.service.LoggerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class LoggerServiceImpl implements LoggerService {
    @Autowired
    private SessionsMapper sessionsMapper;
    @Override
    public Sessions getsession(Integer Id) {
        return sessionsMapper.selectByPrimaryKey(1);
    }
}
