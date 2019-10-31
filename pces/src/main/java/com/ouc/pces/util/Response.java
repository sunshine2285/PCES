/*
 * Copyright (c) 2019
 * FileName: Response.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 22:50:22
 */

package com.ouc.pces.util;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    //请求成功
    public final static int OK = 200;
    //请求服务异常
    public final static int FAILED = 500;
    //资源或请求对象不存在
    public final static int NotFound = 404;
    //禁止访问
    public final static int Forbidden = 403;

    private int code;
    private String msg;
    private Object data;

    public Response() {
    }

    public Response(int code) {
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
