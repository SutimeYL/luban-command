package com.luban.lubancommandback.groupstructure.controller;

import com.luban.lubancommandback.groupstructure.service.GroupStructureService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName GroupStructureController
 * @Author yuanlei
 * @Date 2018/10/15 15:47
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class GroupStructureController {
    @Autowired
    private GroupStructureService groupStructureService;


    /**
     * 获取集团架构
     * @return
     */
    @GetMapping("/groupstructure")
    @ApiOperation(value = "创建集团架构接口",notes = "集团架构")
    @ResponseBody
    public String getGroupStructure(){

        String groupstructure = groupStructureService.getGroupStructure();

        return groupstructure;
    }

    /**
     * 录入集团架构
     * @param structure
     */
    @PostMapping("/igroupstructure")
    @ApiOperation(value = "录入集团结构接口",notes = "录入集团架构")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "structure",value = "集团架构",type = "String")
    })
    public void insertGroupStructure(@RequestParam(value = "structure")String structure){

    }

    /**
     * 删除集团架构
     * @param structureid
     */
    @DeleteMapping("/dgroupstructure")
    @ApiOperation(value = "删除集团结构接口",notes = "删除集团架构")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "structureid",value = "集团架构id",type = "Integer")
    })
    public void deleteGroupStructure(@RequestParam(value = "structureid")Integer structureid){

    }

    /**
     * 更新集团架构
     * @param structureid
     */
    @PutMapping("/pgroupstructure")
    @ApiOperation(value = "更新集团结构接口",notes = "更新集团架构")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "structureid",value = "集团架构id",type = "Integer")
    })
    public void updateGroupStructure(@RequestParam(value = "structureid")Integer structureid){

    }
}
