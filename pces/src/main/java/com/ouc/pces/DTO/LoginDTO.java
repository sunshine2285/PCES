/*
 * Copyright (c) 2019
 * FileName: LoginDTO.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 15:36:45
 */

package com.ouc.pces.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "登录信息DTO")
public class LoginDTO {
    @ApiModelProperty(value = "用户ID",required = true)
    private String userId;
    @ApiModelProperty(value = "用户密码",required = true)
    private String password;

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
