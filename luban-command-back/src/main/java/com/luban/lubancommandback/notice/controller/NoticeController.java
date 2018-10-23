package com.luban.lubancommandback.notice.controller;

import com.luban.lubancommandback.notice.service.NoticeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName NoticeController
 * @Author yuanlei
 * @Date 2018/10/16 10:16
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/back")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 获取通知
     * @return
     */
    @GetMapping("/notice")
    @ApiOperation(value = "创建通知接口",notes = "通知")
    @ResponseBody
    public List getNotice(){

        List notice = noticeService.getNotice();

        return notice;
    }

    @GetMapping("/noticedetil")
    @ApiOperation(value = "创建根据通知列表获取通知详情接口",notes = "通知详情")
    @ResponseBody
    public String getNoticeDetial(@RequestParam(value = "notice")String notice){

        String noticedetial = noticeService.getNoticeDetial(notice);

        return noticedetial;
    }

}
