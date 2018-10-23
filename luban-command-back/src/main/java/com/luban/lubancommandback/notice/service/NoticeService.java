package com.luban.lubancommandback.notice.service;

import java.util.List;

/**
 * @ClassName NoticeService
 * @Author yuanlei
 * @Date 2018/10/16 10:36
 * @Version 1.0
 **/
public interface NoticeService {
    List getNotice();

    String getNoticeDetial(String notice);
}
