package com.luban.command.majorproject.controller;

import com.luban.command.majorproject.service.MajorProjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MajorProjectController
 * @Author yuanlei
 * @Date 2018/10/15 17:22
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class MajorProjectController {
    @Autowired
    private MajorProjectService majorProjectService;



    /**
     * 获取重大工程
     * @return
     */
    @GetMapping("/majorproject")
    @ApiOperation(value = "创建重大工程接口",notes = "重大工程")
    @ResponseBody
    public String getMajorProject(){

        String majorproject = majorProjectService.getMajorProject();
        //返回重大工程的图片案例
        return majorproject;
    }

}
