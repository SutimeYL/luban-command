package com.luban.lubancommandback.capitaltrend.controller;

import com.luban.lubancommandback.capitaltrend.service.CapitaltrendService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName CapitaltrendController
 * @Author yuanlei
 * @Date 2018/10/15 17:19
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class CapitaltrendController {


    @Autowired
    private CapitaltrendService capitaltrendService;

    /**
     * 获取资金走势
     * @return
     */
    @GetMapping("/capitaltrend")
    @ApiOperation(value = "创建资金走势接口",notes = "资金走势")
    @ResponseBody
    public Map<String, Double> getCapitalTrend(){

        Map<String,Double> capitaltrend = capitaltrendService.getCapitalTrend();

        return capitaltrend;
    }
}
