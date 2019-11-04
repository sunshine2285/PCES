/*
 * Copyright (c) 2019
 * FileName: SecurityService.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-03 10:51:16
 */

package com.ouc.pces.service;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {
    /**
     * 邮箱更新验证服务
     * @param StudentId
     * @param verificationCode
     * @return
     */
    public boolean checkUpadateMail(String StudentId, String verificationCode){
        //todo 根据studentId和验证码验证合法性
        return true;
    }
}
