package com.luban.command.weather.controller;

import com.luban.command.weather.service.WeatherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WeatherController
 * @Author yuanlei
 * @Date 2018/10/16 10:19
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    /**
     * 获取时间天气
     * @return
     */
    @GetMapping("/weathertime")
    @ApiOperation(value = "创建时间天气接口",notes = "时间天气")
    @ResponseBody
    public String getWeatherTime(){

        String weatherTime = weatherService.getWeatherTime();

        return weatherTime;
    }
}
