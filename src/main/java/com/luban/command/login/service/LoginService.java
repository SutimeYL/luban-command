package com.luban.command.login.service;

import com.luban.command.login.entity.User;

/**
 * @ClassName LoginService
 * @Author yuanlei
 * @Date 2018/10/16 9:52
 * @Version 1.0
 **/
public interface LoginService {


    /**
     * 登录用户
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);
}
