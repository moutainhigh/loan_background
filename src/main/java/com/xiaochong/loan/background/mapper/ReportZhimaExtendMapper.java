package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.ReportZhimaExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportZhimaExtendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_zhima_extend
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_zhima_extend
     *
     * @mbggenerated
     */
    int insert(ReportZhimaExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_zhima_extend
     *
     * @mbggenerated
     */
    int insertSelective(ReportZhimaExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_zhima_extend
     *
     * @mbggenerated
     */
    ReportZhimaExtend selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_zhima_extend
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReportZhimaExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_report_zhima_extend
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReportZhimaExtend record);


    List<ReportZhimaExtend> selectZhimaId(@Param("zhimaId") Integer zhimaId);


    ReportZhimaExtend selectZhimaIdAndDesc(@Param("zhimaId") Integer zhimaId,@Param("desc")String desc);
}