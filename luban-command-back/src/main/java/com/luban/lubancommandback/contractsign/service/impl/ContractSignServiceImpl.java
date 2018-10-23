package com.luban.lubancommandback.contractsign.service.impl;

import com.luban.lubancommandback.contractsign.dao.ContractSigndao;
import com.luban.lubancommandback.contractsign.service.ContractSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName ContractSignServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 10:25
 * @Version 1.0
 **/
@Service("contracsignService")
public class ContractSignServiceImpl implements ContractSignService {

    @Autowired
    private ContractSigndao contractSigndao;

    @Override
    public HashMap<String,Object> getContractSign() {

        HashMap<String, Object> hashMap = new HashMap<>();

        //返回合同的数量
        Integer contractnum = contractSigndao.queryContractNum();
        //返回合同金额
        double contractAmount = contractSigndao.queryContractAmount();

        //根据工程名称返回合同专业签约的工地数量和文明工地数量

        //查询出工程名称
        List<String> engineeringNames = contractSigndao.querySiteName();
        HashMap<String, Integer> engineeringmap = new HashMap<>();
        Integer siteNum = 0;
        Integer civisiteNum = 0;


        for (String engineeringName : engineeringNames) {
            //工地数量
             siteNum = contractSigndao.querySiteNumByEngineeringName(engineeringName);
            //文明工地数量
             civisiteNum = contractSigndao.queryCiviSiteNumByEngineeringName(engineeringName);

             engineeringmap.put("siteNum",siteNum);
             engineeringmap.put("civisiteNum",civisiteNum);

             //engineeringName工程名称嵌套工地数量和文明工地数量
             hashMap.put(engineeringName,engineeringmap);
        }


        //返回合同底部签约占比(地区占比)
        HashMap<String, Integer> areaAndNum = new HashMap<>();
        Integer areaNum = 0;

        List<String> areaNames = contractSigndao.queryAreaName();
        //根据地区的名称来查询数量
        for (String areaName : areaNames) {
            areaNum = contractSigndao.queryAreaNumByName(areaName);
            areaAndNum.put(areaName,areaNum);
        }

        hashMap.put("contractnum",contractnum);
        hashMap.put("contractAmount",contractAmount);
        hashMap.put("areaAndNum",areaAndNum);



        return hashMap;
    }
}
