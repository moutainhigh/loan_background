package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.ReportLbs;

import java.util.List;

public interface ReportLbsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_lbs
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_lbs
     *
     * @mbggenerated
     */
    int insert(ReportLbs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_lbs
     *
     * @mbggenerated
     */
    int insertSelective(ReportLbs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_lbs
     *
     * @mbggenerated
     */
    ReportLbs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_lbs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReportLbs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_lbs
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReportLbs record);

    ReportLbs getByReportLbs(ReportLbs reportLbs);

    List<ReportLbs> listByReportLbs(ReportLbs reportLbs);
}