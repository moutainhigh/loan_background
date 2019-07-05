package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.AttributionInfo;

import java.util.List;

public interface AttributionInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_attribution_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_attribution_info
     *
     * @mbggenerated
     */
    int insert(AttributionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_attribution_info
     *
     * @mbggenerated
     */
    int insertSelective(AttributionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_attribution_info
     *
     * @mbggenerated
     */
    AttributionInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_attribution_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AttributionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_attribution_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AttributionInfo record);

    void insertByBatch(List<AttributionInfo> attributionInfos);

    AttributionInfo getByAttributionInfo(AttributionInfo attributionInfo);

    List<AttributionInfo> listByAttributionInfo(AttributionInfo attributionInfo);
}