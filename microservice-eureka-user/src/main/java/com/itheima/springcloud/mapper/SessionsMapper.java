package com.itheima.springcloud.mapper;

import com.itheima.springcloud.dao.Sessions;
import com.itheima.springcloud.dao.SessionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionsMapper {
    long countByExample(SessionsExample example);

    int deleteByExample(SessionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sessions record);

    int insertSelective(Sessions record);

    List<Sessions> selectByExample(SessionsExample example);

    Sessions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sessions record, @Param("example") SessionsExample example);

    int updateByExample(@Param("record") Sessions record, @Param("example") SessionsExample example);

    int updateByPrimaryKeySelective(Sessions record);

    int updateByPrimaryKey(Sessions record);
}