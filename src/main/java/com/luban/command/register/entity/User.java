package com.luban.command.register.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName User
 * @Author yuanlei
 * @Date 2018/10/11 16:51
 * @Version 1.0
 **/
@Table(name = "t_user")
public class User implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "access")
    private Integer access;

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username, String password, Integer access) {
        this.username = username;
        this.password = password;
        this.access = access;
    }
}
