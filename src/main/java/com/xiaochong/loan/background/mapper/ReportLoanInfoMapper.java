package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.ReportLoanInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportLoanInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_loan_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_loan_info
     *
     * @mbggenerated
     */
    int insert(ReportLoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_loan_info
     *
     * @mbggenerated
     */
    int insertSelective(ReportLoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_loan_info
     *
     * @mbggenerated
     */
    ReportLoanInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_loan_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReportLoanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_loan_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReportLoanInfo record);


    List<ReportLoanInfo> selectByRuleId(@Param("ruleId") Integer ruleId);


    /**
     * 根据规则id和风险项名称
     * @param ruleId 规则id
     * @param name 风险项名称
     * @return 风险项
     */
    ReportLoanInfo selectByRuleIdAndName(@Param("ruleId")Integer ruleId,@Param("name")String name);
}
