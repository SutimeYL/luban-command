package com.luban.command.index.controller;

import com.luban.command.index.service.IndexService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName IndexController
 * @Author yuanlei
 * @Date 2018/10/17 15:14
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class IndexController {

@Autowired
private IndexService indexService;

    @GetMapping("/product")
    @ApiOperation(value = "创建获取页面数据接口",notes = "获取页面数据")
    @ResponseBody
    public Map<String,Object> getIndexData(){
        Map<String,Object> indexdata = indexService.getData();
        return indexdata;
    }

}
