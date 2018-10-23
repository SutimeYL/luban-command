package com.luban.command.login.service.impl;

import com.luban.command.login.dao.LoginDao;
import com.luban.command.login.entity.User;
import com.luban.command.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 9:52
 * @Version 1.0
 **/
@Service("loginService")
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginDao loginDao;



    @Override
    public User login(String username, String password) {

        System.out.println("username== = " + username);
        System.out.println("password== = " + password);

        User user = loginDao.login(username,password);

        System.out.println("user = " + user.getAccess());

        return user;
    }
}
