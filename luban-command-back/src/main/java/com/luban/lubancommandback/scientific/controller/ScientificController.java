package com.luban.lubancommandback.scientific.controller;

import com.luban.lubancommandback.scientific.service.ScientificService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ScientificController
 * @Author yuanlei
 * @Date 2018/10/15 17:26
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class ScientificController {
    @Autowired
    private ScientificService scientificService;

    /**
     * 获取科研成果
     * @return
     */
    @GetMapping("/scientific")
    @ApiOperation(value = "创建科研成果接口",notes = "科研成果")
    @ResponseBody
    public String getScientific(){

        String scientific =  scientificService.getScientific();

        return scientific;
    }


}
