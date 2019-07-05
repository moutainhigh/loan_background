package com.xiaochong.loan.background.entity.po;

import java.util.Date;

public class ReportBlackInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_black_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_black_info.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_black_info.level
     *
     * @mbggenerated
     */
    private String level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_black_info.rule_id
     *
     * @mbggenerated
     */
    private Integer ruleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_black_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_black_info.id
     *
     * @return the value of loan_report_black_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_black_info.id
     *
     * @param id the value for loan_report_black_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_black_info.name
     *
     * @return the value of loan_report_black_info.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_black_info.name
     *
     * @param name the value for loan_report_black_info.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_black_info.level
     *
     * @return the value of loan_report_black_info.level
     *
     * @mbggenerated
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_black_info.level
     *
     * @param level the value for loan_report_black_info.level
     *
     * @mbggenerated
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_black_info.rule_id
     *
     * @return the value of loan_report_black_info.rule_id
     *
     * @mbggenerated
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_black_info.rule_id
     *
     * @param ruleId the value for loan_report_black_info.rule_id
     *
     * @mbggenerated
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_black_info.create_time
     *
     * @return the value of loan_report_black_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_black_info.create_time
     *
     * @param createTime the value for loan_report_black_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}