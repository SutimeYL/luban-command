package com.luban.command.notice.service.impl;

import com.luban.command.notice.dao.NoticeDao;
import com.luban.command.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName NoticeServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 10:37
 * @Version 1.0
 **/
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<String> getNotice() {

        //返回通知
        List<String> notice = noticeDao.queryNotice();
        return notice;
    }

    @Override
    public String getNoticeDetial(String notice) {

        String noticeDetial = noticeDao.queryNoticeDetialByNotice(notice);
        return noticeDetial;
    }


}
