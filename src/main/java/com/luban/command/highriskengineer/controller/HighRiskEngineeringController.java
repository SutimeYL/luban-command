package com.luban.command.highriskengineer.controller;

import com.luban.command.highriskengineer.service.HighRiskEngineeringService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HighRiskEngineeringController
 * @Author yuanlei
 * @Date 2018/10/15 16:13
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class HighRiskEngineeringController {


    @Autowired
    private HighRiskEngineeringService highRiskEngineeringService;

    /**
     * 获取高危工程
     * @return
     */
    @GetMapping("/highriskengineering")
    @ApiOperation(value = "创建高危工程接口",notes = "高危工程")
    @ResponseBody
    public String getHighRiskEngineering(){

        String highriskengineering = highRiskEngineeringService.getHighRiskEngineering();
      //注入第三方接口，获取视频连接并返回
        return highriskengineering;
    }

    /**
     * 录入监控记录数据
     * @param engineering
     */
    @PostMapping("/ihighriskengineering")
    @ApiOperation(value = "录入监控记录数据接口",notes = "录入监控记录数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "engineering",value = "工程",type = "String")
    })
    public void insertHighRiskEngineering(@RequestParam(value = "engineering")String engineering){

    }

    /**
     * 删除监控记录数据
     * @param engineeringid
     */
    @DeleteMapping("/dhighriskengineering")
    @ApiOperation(value = "删除监控记录数据接口",notes = "删除监控记录数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "engineeringid",value = "工程id",type = "Integer")
    })
    public void deleteHighRiskEngineering(@RequestParam(value = "engineeringid")Integer engineeringid ){

    }

    /**
     * 更新监控记录数据
     * @param engineeringid
     */
    @PutMapping("/phighriskengineering")
    @ApiOperation(value = "更新监控记录数据接口",notes = "更新监控记录数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "engineeringid",value = "工程id",type = "Integer")
    })
    public void updateHighRiskEngineering(@RequestParam(value = "engineeringid")Integer engineeringid ){

    }

}
