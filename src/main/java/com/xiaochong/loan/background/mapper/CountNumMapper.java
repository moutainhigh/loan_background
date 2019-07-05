package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.CountNum;

public interface CountNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_count_num
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_count_num
     *
     * @mbggenerated
     */
    int insert(CountNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_count_num
     *
     * @mbggenerated
     */
    int insertSelective(CountNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_count_num
     *
     * @mbggenerated
     */
    CountNum selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_count_num
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CountNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_count_num
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CountNum record);

    CountNum getByCountNum(CountNum countNum);

    int cleanAllValue();
}