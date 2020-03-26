package com.itheima.springcloud.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.springcloud.dao.SessionsExample;
import com.itheima.springcloud.entity.Sessions;
import com.itheima.springcloud.mapper.SessionsMapper;
import com.itheima.springcloud.service.PageHelperService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Slf4j
@Service
public class PageHelperServiceImpl implements PageHelperService {
    @Autowired
    private SessionsMapper sessionsMapper;

    @Override
    public List<Sessions> getSessions(Date starttime, Date endtime, String usr, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SessionsExample sessionsExample = new SessionsExample();
        SessionsExample.Criteria criteria = sessionsExample.createCriteria();
        if (!StringUtils.isEmpty(usr)) {
            criteria.andUsrLike('%' + usr + '%');
        }
        if (starttime != null && endtime != null) {
            criteria.andStarttimeBetween(starttime, endtime);
        }
        List<Sessions> sessions = sessionsMapper.selectByExample(sessionsExample);
        return sessions;
    }
}
