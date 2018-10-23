package com.luban.lubancommandback.materialprocurement.dao;

import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

/**
 * @ClassName MaterialProcurementDao
 * @Author yuanlei
 * @Date 2018/10/16 15:41
 * @Version 1.0
 **/
@Repository
public interface MaterialProcurementDao {
    /**
     * 查询采购总额
     * @return
     */
    double queryTotalPurchase();

    /**
     * 查询采集总额
     * @return
     */
    double queryTotalCollect();

    /**
     * 查询材料名称
     * @return
     */
    List<String> queryMaterialName();

    /**
     * 根据材料名称查询材料数量
     * @param materialName
     * @return
     */
    Integer queryMaterialNumByName(String materialName);

    /**
     * 查询地区名
     * @return
     */
    List<String> queryAreaName();

    /**
     * 根据地区名称查询数量
     * @param areaName
     * @return
     */
    Integer queryAreaNumByName(String areaName);

//    /**
//     * 查询最大日期
//     * @return
//     */
//    Calendar queryMaxYear();
//
//    /**
//     * 查询最小日期
//     * @return
//     */
//    Calendar queryMinYear();

    /**
     * 按年份查询总金额
     * @return
     */
    List<Double> queryTotalPurchaseByTime();

    /**
     * 查询采购方式
     * @return
     */
    List<String> queryPurchaseWay();

    /**
     * 根据采购方式的名称查询各采购方式的数量
     * @param purchaseWay
     * @return
     */
    Integer queryPurchaseNumByPurchaseWay(String purchaseWay);
}
