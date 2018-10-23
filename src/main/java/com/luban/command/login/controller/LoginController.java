package com.luban.command.login.controller;

import com.luban.command.login.entity.User;
import com.luban.command.login.service.LoginService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Author yuanlei
 * @Date 2018/10/11 16:54
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
//@Api("用户服务接口")
public class LoginController {


    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    @ApiOperation(value = "创建用户登录接口",notes = "用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",type = "String"),
            @ApiImplicitParam(name = "password",value = "密码",type = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "登录成功"),
            @ApiResponse(code = 404, message = "登录失败"),
            @ApiResponse(code = 500, message = "服务器异常"),
    })
    public ResponseEntity<User> login(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password){

        User user = loginService.login(username,password);


        System.out.println("username = " + username);
        System.out.println("password = " + password);

        if(user==null){
            System.out.println("登录失败");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.println("登陆成功 user = " + user);


        return ResponseEntity.ok(user);
    }

}
