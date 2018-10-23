package com.luban.command.safetyquality.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName SafetyQualityDao
 * @Author yuanlei
 * @Date 2018/10/17 10:04
 * @Version 1.0
 **/
@Repository
public interface SafetyQualityDao {

    double queryAccidentNum();

    double queryDeathNum();

    double queryMajorAccidentNum();

    double queryMajorDeathNum();

    double queryAccidentRatio();

    double queryQualified();

    double queryUnQualified();
}
