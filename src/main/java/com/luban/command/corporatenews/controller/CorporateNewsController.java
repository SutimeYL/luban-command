package com.luban.command.corporatenews.controller;

import com.luban.command.corporatenews.service.CorporateNewsService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName CorporateNewsController
 * @Author yuanlei
 * @Date 2018/10/15 15:42
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/index")
public class CorporateNewsController {


    @Autowired
    private CorporateNewsService corporateNewsService;

    /**
     * 获取企业新闻
     * @return
     */
    @GetMapping("/corporatenews")
    @ApiOperation(value = "创建企业新闻接口",notes = "企业新闻")
    @ResponseBody
    public String getCorporateNews(){

        String corporateNews = corporateNewsService.getCorporateNews();

        return corporateNews;
    }


    /**
     * 录入企业新闻
     * @param news
     */
    @PostMapping("/inews")
    @ApiOperation(value = "录入企业新闻接口",notes = "录入企业新闻")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "news",value = "新闻",type = "String")
    })
    public void insertWeatherTime(@RequestParam(value = "news",defaultValue = "")String news){

    }

    /**
     * 删除企业新闻
     * @param newsid
     */
    @DeleteMapping("/dnews")
    @ApiOperation(value = "删除企业新闻接口",notes = "删除企业新闻")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "news",value = "新闻id",type = "Integer")
    })
    public void deleteWeatherTime(@RequestParam(value = "newsid")Integer newsid){

    }


    /**
     * 更新企业新闻
     * @param newsid
     */
    @PutMapping("/pnews")
    @ApiOperation(value = "更新企业新闻接口",notes = "更新企业新闻")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "news",value = "新闻id",type = "Integer")
    })
    public void updateWeatherTime(@RequestParam(value = "newsid")Integer newsid){

    }


}
