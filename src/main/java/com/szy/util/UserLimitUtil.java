package com.szy.util;

/**
 * 用户权限
 * Created by shizhouyong on 2016/12/2.
 */
public class UserLimitUtil {

    public static final int USER_LOGIN = 0x01;      //登录权限
    public static final int USER_TEACHER = 0x04;    //管理员用户
    public static final int USER_STUDENT = 0x02;    //学生用户

    public static boolean verify(int userLimit,int limit) {
        return userLimit != -1 && (userLimit & limit) == limit;
    }

}
