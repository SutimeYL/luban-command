package com.luban.command.projectmanager.controller;

import com.luban.command.projectmanager.service.ProjectManagerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName ProjectManagerController
 * @Author yuanlei
 * @Date 2018/10/15 17:18
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class ProjectManagerController {
    @Autowired
    private ProjectManagerService projectManagerService;

    /**
     * 获取项目经营情况
     * @return
     */
    @GetMapping("/projectmanager")
    @ApiOperation(value = "创建项目经营情况接口",notes = "项目经营情况")
    @ResponseBody
    public HashMap<String, Object> getProjectManager(){

        HashMap<String,Object> projectmanager = projectManagerService.getProjectManager();

        return projectmanager;
    }

}
