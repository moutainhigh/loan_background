package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.MerchantAccount;
import org.apache.ibatis.annotations.Param;

public interface MerchantAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merchant_account
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merchant_account
     *
     * @mbggenerated
     */
    int insert(MerchantAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merchant_account
     *
     * @mbggenerated
     */
    int insertSelective(MerchantAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merchant_account
     *
     * @mbggenerated
     */
    MerchantAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merchant_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MerchantAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merchant_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MerchantAccount record);

    MerchantAccount selectMerchantAccountByMerchId(@Param("merchId") Integer merchId);
}