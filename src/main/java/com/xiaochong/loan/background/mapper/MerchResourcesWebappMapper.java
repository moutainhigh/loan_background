package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.MerchResourcesWebapp;

import java.util.List;

public interface MerchResourcesWebappMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_resources_webapp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_resources_webapp
     *
     * @mbggenerated
     */
    int insert(MerchResourcesWebapp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_resources_webapp
     *
     * @mbggenerated
     */
    int insertSelective(MerchResourcesWebapp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_resources_webapp
     *
     * @mbggenerated
     */
    MerchResourcesWebapp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_resources_webapp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MerchResourcesWebapp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_resources_webapp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MerchResourcesWebapp record);

    List<MerchResourcesWebapp> listByMerchResourcesWebapp(MerchResourcesWebapp merchResourcesWebapp);
}