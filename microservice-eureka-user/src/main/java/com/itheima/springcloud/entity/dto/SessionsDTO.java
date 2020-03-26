package com.itheima.springcloud.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;

import java.util.Date;

@Data
public class SessionsDTO {

    private Integer id;

    private String app;

    @JSONField(serialzeFeatures=SerializerFeature.WriteNullStringAsEmpty)
    private String usr;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date starttime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endtime;
}
