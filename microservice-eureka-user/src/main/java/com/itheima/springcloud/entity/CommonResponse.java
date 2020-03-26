package com.itheima.springcloud.entity;

import lombok.Data;


import java.io.Serializable;

@Data
public class CommonResponse<T> implements Serializable {
    private static final long servialVersion = 7927310517751221998L;
    private String code;
    private String message;
    private T data;

    public CommonResponse() {

    }

    public CommonResponse(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    private CommonResponse(T data) {
        this.data = data;
    }

    public static CommonResponse successResponse() {
        return new CommonResponse("200", "操作成功");
    }

    public static CommonResponse errorResponse() {
        return new CommonResponse("500", "操作失败");
    }

    public static CommonResponse errorResponse(String message) {
        return new CommonResponse("500", message);
    }

    public static CommonResponse successResponse(Object data) {
        CommonResponse result = CommonResponse.successResponse();
        result.setData(data != null ? data : "");
        return result;
    }
}
