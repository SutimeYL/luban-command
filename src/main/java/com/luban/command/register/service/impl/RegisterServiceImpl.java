package com.luban.command.register.service.impl;

import com.luban.command.register.dao.RegisterDao;
import com.luban.command.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName RegisterServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 9:50
 * @Version 1.0
 **/
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterDao registerDao;

    @Override
    public Integer register(String username, String password) {

        Integer register = registerDao.register(username,password);

        return register;
    }
}
