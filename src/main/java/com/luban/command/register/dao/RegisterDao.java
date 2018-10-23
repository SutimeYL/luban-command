package com.luban.command.register.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName RegisterDao
 * @Author yuanlei
 * @Date 2018/10/11 16:55
 * @Version 1.0
 **/
@Repository
public interface RegisterDao {
    /**
     * 插入用户
     * @param username
     * @param password
     * @param phone
     */
    void insertUser(@Param("username") String username, @Param("password") String password, @Param("phone") String phone);


    /**
     * 用户注册
     * @param username
     * @param password
     * @return
     */
    Integer register(@Param("username") String username,@Param("password") String password);
}
