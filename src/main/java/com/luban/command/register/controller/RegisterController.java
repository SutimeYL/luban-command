package com.luban.command.register.controller;


import com.luban.command.register.service.RegisterService;
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
public class RegisterController {


    @Autowired
    private RegisterService registerService;


    @PostMapping("/register")
    @ApiOperation(value = "创建用户注册接口",notes="注册账号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",type = "String"),
            @ApiImplicitParam(name = "password",value = "密码",type = "String"),
            @ApiImplicitParam(name = "repassword",value = "确认密码",type = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "注册成功"),
            @ApiResponse(code = 404, message = "注册失败"),
            @ApiResponse(code = 500, message = "服务器异常"),
    })
    public ResponseEntity<Integer> register(
                         @RequestParam(value = "username",defaultValue = "")String username,
                         @RequestParam(value = "password",defaultValue = "")String password,
                         @RequestParam(value = "repassword",defaultValue = "")String repassword){


        //判断用户密码和确认密码是否一致
        if(password.equals(repassword)){
            //注册用户信息
            Integer i = registerService.register(username,password);

            if(i==null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return ResponseEntity.ok(i);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
