package com.luban.command.capitaltrend.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName CapitaltrendDao
 * @Author yuanlei
 * @Date 2018/10/16 11:17
 * @Version 1.0
 **/
@Repository
public interface CapitaltrendDao {

    /**
     * 查询计划收入
     * @return
     */
    double queryPlandIncome();

    /**
     * 查询计划成本
     * @return
     */
    double queryPlandCost();

    /**
     * 查询实际收入
     * @return
     */
    double queryActualIncome();

    /**
     * 查询实际成本
     * @return
     */
    double queryActualCost();

}
