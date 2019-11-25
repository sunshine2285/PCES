/*
 * Copyright (c) 2019
 * FileName: StringCheckUtils.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-04 19:47:15
 */

package com.ouc.pces.utils;

public class StringCheckUtils {
    public static boolean checkIsEmpty(String str) {
        return (str == null || "".equals(str.trim()));
    }

    public static boolean checkPwdStr(String passwordStr) {
        if (checkIsEmpty(passwordStr))
            return false;
        //todo 密码字符串合法性检查
        return true;
    }

    public static boolean checkMailStr(String mailStr) {
        if (checkIsEmpty(mailStr))
            return false;
        return true;
    }
}
