package com.luban.lubancommandback.capitaltrend.service.impl;


import com.luban.lubancommandback.capitaltrend.dao.CapitaltrendDao;
import com.luban.lubancommandback.capitaltrend.service.CapitaltrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @ClassName CapitaltrendServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 10:24
 * @Version 1.0
 **/
@Service("capitaltrendService")
public class CapitaltrendServiceImpl implements CapitaltrendService {


    @Autowired
    private CapitaltrendDao capitaltrendDao;

    @Override
    public HashMap<String,Double> getCapitalTrend() {
        //根据时间间断返回资金的累计计划收入，累计计划成本，累计计划利润

        //累计计划收入
        double plandIncome = capitaltrendDao.queryPlandIncome();
        //累计计划成本
        double plandCost = capitaltrendDao.queryPlandCost();
        //累计计划利润
        double plandProfit = plandIncome - plandCost;


        //累计实际收入，累计实际成本，累计实际利润

        //累计实际收入
        double actualIncome = capitaltrendDao.queryActualIncome();
        //累计实际成本
        double actualCost = capitaltrendDao.queryActualCost();
        //累计实际利润
        double actualProfit = actualIncome - actualCost;

        //调用mapper层
        HashMap<String, Double> map = new HashMap<>();

        map.put("plandIncome",plandIncome);
        map.put("plandCost",plandCost);
        map.put("plandProfit",plandProfit);
        map.put("actualIncome",actualIncome);
        map.put("actualCost",actualCost);
        map.put("actualProfit",actualProfit);


        return map;
    }
}
