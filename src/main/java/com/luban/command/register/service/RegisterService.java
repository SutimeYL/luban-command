package com.luban.command.register.service;

/**
 * @ClassName RegisterService
 * @Author yuanlei
 * @Date 2018/10/16 9:50
 * @Version 1.0
 **/
public interface RegisterService {

    /**
     * 注册用户
     * @param username
     * @param password
     * @return
     */
    Integer register(String username, String password);
}
