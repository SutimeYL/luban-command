package com.luban.command.login.dao;

import com.luban.command.login.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName LoginDao
 * @Author yuanlei
 * @Date 2018/10/18 15:00
 * @Version 1.0
 **/
@Repository
public interface LoginDao {
    /**
     *
     * @param username
     * @param password
     * @return
     */
    User login(@Param("username") String username, @Param("password") String password);
}
