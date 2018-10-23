package com.luban.lubancommandback.materialprocurement.controller;

import com.luban.lubancommandback.materialprocurement.service.MaterialProcurementService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName MaterialProcurementController
 * @Author yuanlei
 * @Date 2018/10/15 17:24
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class MaterialProcurementController {

    @Autowired
    private MaterialProcurementService materialProcurementService;

    /**
     * 获取物资采购
     * @return
     */
    @GetMapping("/materialprocurement")
    @ApiOperation(value = "创建物资采购接口",notes = "物资采购")
    @ResponseBody
    public HashMap<String, Object> getMaterialProcurement(){

        HashMap<String,Object> materialprocurement = materialProcurementService.getMaterialProcurement();

        return materialprocurement;
    }
}
