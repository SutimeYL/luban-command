package com.luban.command.projectmonitory.controller;

import com.luban.command.projectmonitory.service.ProjectMonitoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ProjectMonitoryController
 * @Author yuanlei
 * @Date 2018/10/15 15:56
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class ProjectMonitoryController {

    @Autowired
    private ProjectMonitoryService projectMonitoryService;

    /**
     * 获取项目监控
     * @return
     */
    @GetMapping("/projectmonitoring")
    @ApiOperation(value = "创建项目监控接口",notes = "项目监控")
    @ResponseBody
    public String getProjectMonitoring(){

        String projectmonitoring = projectMonitoryService.getProjectMonitoring();

        return projectmonitoring;
    }

    /**
     * 录入监控记录数据
     * @param monitoring
     */
    @PostMapping("/projectmonitoring")
    public void insertProjectMonitoring(@RequestParam(value = "monitoring")String monitoring){

    }

    /**
     * 删除监控记录数据
     * @param monitoring
     */
    @DeleteMapping("/projectmonitoring")
    public void deleteProjectMonitoring(@RequestParam(value = "monitoringid")Integer monitoring ){

    }
}
