package com.luban.lubancommandback.safetyquality.service.impl;

import com.luban.lubancommandback.safetyquality.dao.SafetyQualityDao;
import com.luban.lubancommandback.safetyquality.service.SafetyQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SafetyQualityServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 10:42
 * @Version 1.0
 **/
@Service("safetyqualityService")
public class SafetyQualityServiceImpl implements SafetyQualityService {

    @Autowired
    private SafetyQualityDao safetyQualityDao;

    @Override
    public String getSafetyQuality() {

        //根据时间间断返回事故起数，死亡人数，事故占比，重大事故数量，重大事故死亡人数
//         返回事故起数
        double accidentNum = safetyQualityDao.queryAccidentNum();
//         返回死亡人数
        double deathNum = safetyQualityDao.queryDeathNum();
//         返回重大事故的起数
        double majorAccidentNum = safetyQualityDao.queryMajorAccidentNum();
//         返回重大事故死亡人数
        double majorDeathNum = safetyQualityDao.queryMajorDeathNum();
//         返回事故占比
       double accidentRatio = safetyQualityDao.queryAccidentRatio();
        //返回质量合格率和不合格率
        //查询质量合格数量和质量不合格数量
        double qualified = safetyQualityDao.queryQualified();
        double unqualified = safetyQualityDao.queryUnQualified();
        //根据时间间断返回工地数量，文明工地数量，计算得文盲工地占比
        //根据年份分组查询工地数量和文明工地数量

        //返回优质工程名录(包含项目名称和获得奖项)
        return null;
    }
}
