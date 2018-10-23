package com.luban.command.contractsign.controller;

import com.luban.command.contractsign.service.ContractSignService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName ContractSignController
 * @Author yuanlei
 * @Date 2018/10/15 17:15
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class ContractSignController {

    @Autowired
    private ContractSignService contractSignService;

    /**
     * 获取合同签约
     * @return
     */
    @GetMapping("/contractsign")
    @ApiOperation(value = "创建合同签约接口",notes = "合同签约")
    @ResponseBody
    public HashMap<String, Object> getContractSign(){

        HashMap<String,Object> contractsign = contractSignService.getContractSign();


        return contractsign;
    }

}
