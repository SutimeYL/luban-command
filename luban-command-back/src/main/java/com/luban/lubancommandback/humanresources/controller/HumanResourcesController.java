package com.luban.lubancommandback.humanresources.controller;

import com.luban.lubancommandback.humanresources.service.HumanResourcesService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HumanResourcesController
 * @Author yuanlei
 * @Date 2018/10/15 16:21
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class HumanResourcesController {


    @Autowired
    private HumanResourcesService humanResourcesService;
    /**
     * 获取人力资源
     * @return
     */
    @GetMapping("/humanresources")
    @ApiOperation(value = "创建人力资源接口",notes = "人力资源")
    @ResponseBody
    public String getHumanResources(){

        String humanresources = humanResourcesService.getHumanResources();

        //返回企业在职各类人员的数量及地区
        //返回企业在职人员职称的数量并计算出占比
        //返回在职人员的学历各学历数量并计算出占比
        //返回各个地区的劳务人数，并计算占比
        //返回持证上岗率
        return humanresources;
    }


    /**
     * 录入总在职人员数
     * @param totalstaff
     */
    @PostMapping("/totalstaff")
    @ApiOperation(value = "创建录入人力资源接口",notes = "录入人力资源")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "totalstaff",value = "总在职人数",type = "Integer")
    })
    public void insertTotalStaff(@RequestParam(value = "totalstaff")Integer totalstaff){

    }

    /**
     * 录入地区和人数
     * @param area
     * @param person
     */
    @PostMapping("/area")
    @ApiOperation(value = "创建录入地区和人数接口",notes = "录入地区和人数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "area",value = "地区",type = "String"),
            @ApiImplicitParam(name = "person",value = "人数",type = "Integer")
    })
    public void insertAreaAndPerson(@RequestParam(value = "area")String area,@RequestParam(value = "person")Integer person){

    }


    /**
     * 录入职称占比
     * @param jobtitle
     * @param proportion
     */
    @PostMapping("/jobtitle")
    @ApiOperation(value = "创建录入职称占比接口",notes = "录入职称占比资源")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "jobtitle",value = "职称",type = "String"),
            @ApiImplicitParam(name = "proportion",value = "职称占比",type = "Double")
    })
    public void insertJobTitleAndProportion(@RequestParam(value = "jobtitle")String jobtitle,@RequestParam(value = "proportion")Double proportion){

    }


    /**
     * 录入在职人员学历占比
     * @param education
     * @param proportion
     */
    @PostMapping("/education")
    @ApiOperation(value = "创建录入在职人员学历占比接口",notes = "录入在职人员学历占比")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "education",value = "在职人员学历",type = "String"),
            @ApiImplicitParam(name = "proportion",value = "在职人员学历占比",type = "Double")
    })
    public void insertEducationAndProportion(@RequestParam(value = "education")String education,@RequestParam(value = "proportion")Double proportion){

    }

    /**
     * 录入劳动人数地区占比
     * @param labor
     * @param area
     * @param proportion
     */
    @PostMapping("/labor")
    @ApiOperation(value = "创建录入劳动人数地区占比接口",notes = "录入劳动人数地区占比")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "laborNum",value = "录入各地区的劳动人数",type = "Integer"),
            @ApiImplicitParam(name = "area",value = "录入地区",type = "String"),
            @ApiImplicitParam(name = "proportion",value = "录入劳动人数地区占比",type = "Double")
    })
    public void insertLaBorAreaNumAndProportion(@RequestParam(value = "laborNum")Integer labor,@RequestParam(value = "area")String area,@RequestParam(value = "proportion")Double proportion){

    }

    /**
     * 持证人员占比
     * 无证人员占比
     * @param pocp
     * @param nocp
     */
    @PostMapping("/pocp")
    @ApiOperation(value = "创建录入持证人员和无证人员占比的接口",notes = "录入持证人员和无证人员的占比")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pocp",value = "录入持证人员占比",type = "Double"),
            @ApiImplicitParam(name = "nocp",value = "录入无证人员占比",type = "Double")
    })
    public void insertLicensedPersonnelAndProportion(@RequestParam(value = "pocp")Double pocp,@RequestParam(value = "nocp")Double nocp){

    }
}
