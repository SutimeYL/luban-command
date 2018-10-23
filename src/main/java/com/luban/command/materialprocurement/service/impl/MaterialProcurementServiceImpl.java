package com.luban.command.materialprocurement.service.impl;

import com.luban.command.materialprocurement.dao.MaterialProcurementDao;
import com.luban.command.materialprocurement.service.MaterialProcurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MaterialProcurementServiceImpl
 * @Author yuanlei
 * @Date 2018/10/16 10:35
 * @Version 1.0
 **/
@Service("materialprocurementService")
public class MaterialProcurementServiceImpl implements MaterialProcurementService {


    @Autowired
    private MaterialProcurementDao materialProcurementDao;

    @Override
    public HashMap<String, Object> getMaterialProcurement() {

        HashMap<String, Object> MaterialProcurementMap = new HashMap<>();

        //返回采购总额
       double totalPurchase =  materialProcurementDao.queryTotalPurchase();
        //返回采集总额
       double totalCollect =  materialProcurementDao.queryTotalCollect();

        //根据材料名称返回大宗材料的数量
        //查询所有的材料名称
        List<String> materialNames = materialProcurementDao.queryMaterialName();
        HashMap<String, Integer> materialmap = new HashMap<>();
        Integer materialNum = 0;
        for (String materialName : materialNames) {
            materialNum = materialProcurementDao.queryMaterialNumByName(materialName);
            //materialName材料名称,materialNum材料数量
            materialmap.put(materialName,materialNum);
        }

        //返回采购地区的占比
        HashMap<String, Integer> areaAndNum = new HashMap<>();
        Integer areaNum = 0;

        List<String> areaNames = materialProcurementDao.queryAreaName();
        //根据地区的名称来查询数量
        for (String areaName : areaNames) {
            areaNum = materialProcurementDao.queryAreaNumByName(areaName);
            areaAndNum.put(areaName,areaNum);
        }

        //返回每年的总采购额
        //查询出最大年份和最小年份
//        Calendar MaxDate = materialProcurementDao.queryMaxYear();
//        Calendar MinDate = materialProcurementDao.queryMinYear();
//
//        int maxyear = MaxDate.get(Calendar.YEAR);
//        int minyear = MinDate.get(Calendar.YEAR);

        HashMap<Integer, Double> totalPurchaseMap = new HashMap<>();

//        for (int year = minyear;year<=maxyear;year++){


            //根据年份查找该年份的总采购额,先按照年份分组，在查询出每组的采购总额
            List<Double> totalPurchaseByTime = materialProcurementDao.queryTotalPurchaseByTime();

//            //year年份,totalPurchaseByTime该年份的总采购额
//            totalPurchaseMap.put(year,totalPurchaseByTime);
//        }

        //返回采购方式预算的占比(招标类,竞争性谈判,单一来源,其他)

        //查询所有的采购方式的数量
        List<String> purchaseWays = materialProcurementDao.queryPurchaseWay();
        HashMap<String, Object> purchaseWaymap = new HashMap<>();
        Integer purchaseNum = 0;
        for (String purchaseWay : purchaseWays) {
            //根据采购方式获取各采购方式的数量
            purchaseNum = materialProcurementDao.queryPurchaseNumByPurchaseWay(purchaseWay);
            purchaseWaymap.put(purchaseWay,purchaseNum);
        }

        MaterialProcurementMap.put("totalPurchase",totalPurchase);
        MaterialProcurementMap.put("totalCollect",totalCollect);
        MaterialProcurementMap.put("materialmap",materialmap);
        MaterialProcurementMap.put("areaAndNum",areaAndNum);
        MaterialProcurementMap.put("totalPurchaseMap",totalPurchaseMap);
        MaterialProcurementMap.put("purchaseWaymap",purchaseWaymap);

        return MaterialProcurementMap;
    }
}
