package com.luban.lubancommandback.projectmanager.service.impl;

import com.luban.lubancommandback.projectmanager.dao.ProjectManagerDao;
import com.luban.lubancommandback.projectmanager.service.ProjectManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName ProjectManagerServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 10:38
 * @Version 1.0
 **/
@Service("projectmanagerService")
public class ProjectManagerServiceImpl implements ProjectManagerService {

    @Autowired
    private ProjectManagerDao projectManagerDao;

    @Override
    public HashMap<String, Object> getProjectManager() {



        HashMap<String, Object> projectManagermap = new HashMap<>();

        //查询集团产值指标,已完成数量和未完成数量
        //已完成数量
        double donenum = projectManagerDao.queryDoneNum();
        //未完成数量
        double undonenum = projectManagerDao.queryUnDoneNum();


        //返回本年度计划完成产值，累计完成产值
        //查询年度计划完成产值
        double plandOutPutValue = projectManagerDao.queryPlandOutPutValue();
        double totalOutPutValue = projectManagerDao.queryTotalOutPutValue();
        //根据季度返回工程类型产值指标(PTOV工程类型产值)
        double PTOV = projectManagerDao.queryPTOV();
        //根据地区返回地区产值占比
        HashMap<String, Double> areaAndNum = new HashMap<>();
        double areaValue = 0;
        List<String> areaNames = projectManagerDao.queryAreaName();
        //根据地区的名称来查询产值
        for (String areaName : areaNames) {
            areaValue = projectManagerDao.queryOutPutValueByName(areaName);
            areaAndNum.put(areaName,areaValue);
        }

        //根据季度返回计划产值的计划收入和计划成本计算得出累计计划利润占比


        List<Double> plandOutPutValueByQuarter = projectManagerDao.queryPlandOutPutValueByQuarter();
        List<Double> plandOutPutCostByQuarter = projectManagerDao.queryPlandOutPutCostByQuarter();

        //根据季度返回实际产值的计划收入和计划成本计算得出累计计划利润占比

        List<Double> actualOutPutValueByQuarter = projectManagerDao.queryActualOutPutValueByQuarter();
        List<Double> actualOutPutCostByQuarter = projectManagerDao.queryActualOutPutCostByQuarter();

        projectManagermap.put("donenum",donenum);
        projectManagermap.put("undonenum",undonenum);

        projectManagermap.put("plandOutPutValue",plandOutPutValue);
        projectManagermap.put("totalOutPutValue",totalOutPutValue);

        projectManagermap.put("areaAndNum",areaAndNum);
        projectManagermap.put("plandOutPutValueByQuarter",plandOutPutValueByQuarter);
        projectManagermap.put("plandOutPutCostByQuarter",plandOutPutCostByQuarter);
        projectManagermap.put("actualOutPutValueByQuarter",actualOutPutValueByQuarter);
        projectManagermap.put("actualOutPutCostByQuarter",actualOutPutCostByQuarter);


        return projectManagermap;
    }
}
