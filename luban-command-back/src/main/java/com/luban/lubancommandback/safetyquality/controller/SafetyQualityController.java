package com.luban.lubancommandback.safetyquality.controller;

import com.luban.lubancommandback.safetyquality.service.SafetyQualityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SafetyQualityController
 * @Author yuanlei
 * @Date 2018/10/15 17:12
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class SafetyQualityController {

    @Autowired
    private SafetyQualityService safetyQualityService;

    /**
     * 获取安全质量
     * @return
     */
    @GetMapping("/safetyquality")
    @ApiOperation(value = "创建安全质量接口",notes = "安全质量")
    @ResponseBody
    public String getSafetyQuality(){

        String safetyquality = safetyQualityService.getSafetyQuality();

        return safetyquality;
    }

}
