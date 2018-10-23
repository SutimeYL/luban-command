package com.luban.command.contractsign.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ContractSigndao
 * @Author yuanlei
 * @Date 2018/10/16 14:09
 * @Version 1.0
 **/
@Repository
public interface ContractSigndao {
    /**
     * 查询合同数量
     * @return
     */
    Integer queryContractNum();

    /**
     * 查询合同金额
     * @return
     */
    double queryContractAmount();

    /**
     * 查询工地名称
     * @return
     */
    List<String> querySiteName();

    /**
     * 根据工程名称查询工地数量
     * @param engineeringName
     * @return
     */
    Integer querySiteNumByEngineeringName(String engineeringName);

    /**
     * 根据工程名称查询文明工地数量
     * @param engineeringName
     * @return
     */
    Integer queryCiviSiteNumByEngineeringName(String engineeringName);

    /**
     * 查询地区名称
     * @return
     */
    List<String> queryAreaName();

    /**
     * 根据地区名称查询地区数量
     * @param areaName
     * @return
     */
    Integer queryAreaNumByName(String areaName);

}
