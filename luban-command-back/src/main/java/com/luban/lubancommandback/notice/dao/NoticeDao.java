package com.luban.lubancommandback.notice.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName NoticeDao
 * @Author yuanlei
 * @Date 2018/10/16 17:33
 * @Version 1.0
 **/
@Repository
public interface NoticeDao {
    List<String> queryNotice();

    String queryNoticeDetialByNotice(String notice);
}
