package com.luban.lubancommandback.projectmanager.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ProjectManagerDao
 * @Author yuanlei
 * @Date 2018/10/16 18:10
 * @Version 1.0
 **/
@Repository
public interface ProjectManagerDao {
    double queryDoneNum();

    double queryUnDoneNum();

    double queryPlandOutPutValue();

    double queryTotalOutPutValue();

    double queryPTOV();

    List<String> queryAreaName();

    double queryOutPutValueByName(String areaName);

    List<Double> queryPlandOutPutValueByQuarter();

    List<Double> queryPlandOutPutCostByQuarter();

    List<Double> queryActualOutPutValueByQuarter();

    List<Double> queryActualOutPutCostByQuarter();
}
