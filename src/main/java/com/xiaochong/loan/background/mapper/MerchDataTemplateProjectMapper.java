package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.MerchDataTemplateProject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchDataTemplateProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_data_template_project
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_data_template_project
     *
     * @mbggenerated
     */
    int insert(MerchDataTemplateProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_data_template_project
     *
     * @mbggenerated
     */
    int insertSelective(MerchDataTemplateProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_data_template_project
     *
     * @mbggenerated
     */
    MerchDataTemplateProject selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_data_template_project
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MerchDataTemplateProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_merch_data_template_project
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MerchDataTemplateProject record);

    List<MerchDataTemplateProject> selectProjectByTemplateId(@Param("templateId") Integer templateId);

    int selectCountProjectByTemplateId(@Param("templateId") Integer templateId);
}