package com.xiaochong.loan.background.entity.po;

import java.util.Date;

public class ReportLbs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_lbs.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_lbs.filed_name
     *
     * @mbggenerated
     */
    private String filedName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_lbs.filed_desc
     *
     * @mbggenerated
     */
    private String filedDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_lbs.filed_value
     *
     * @mbggenerated
     */
    private String filedValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_lbs.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_report_lbs.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_lbs.id
     *
     * @return the value of loan_report_lbs.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_lbs.id
     *
     * @param id the value for loan_report_lbs.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_lbs.filed_name
     *
     * @return the value of loan_report_lbs.filed_name
     *
     * @mbggenerated
     */
    public String getFiledName() {
        return filedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_lbs.filed_name
     *
     * @param filedName the value for loan_report_lbs.filed_name
     *
     * @mbggenerated
     */
    public void setFiledName(String filedName) {
        this.filedName = filedName == null ? null : filedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_lbs.filed_desc
     *
     * @return the value of loan_report_lbs.filed_desc
     *
     * @mbggenerated
     */
    public String getFiledDesc() {
        return filedDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_lbs.filed_desc
     *
     * @param filedDesc the value for loan_report_lbs.filed_desc
     *
     * @mbggenerated
     */
    public void setFiledDesc(String filedDesc) {
        this.filedDesc = filedDesc == null ? null : filedDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_lbs.filed_value
     *
     * @return the value of loan_report_lbs.filed_value
     *
     * @mbggenerated
     */
    public String getFiledValue() {
        return filedValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_lbs.filed_value
     *
     * @param filedValue the value for loan_report_lbs.filed_value
     *
     * @mbggenerated
     */
    public void setFiledValue(String filedValue) {
        this.filedValue = filedValue == null ? null : filedValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_lbs.order_no
     *
     * @return the value of loan_report_lbs.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_lbs.order_no
     *
     * @param orderNo the value for loan_report_lbs.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_report_lbs.create_time
     *
     * @return the value of loan_report_lbs.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_report_lbs.create_time
     *
     * @param createTime the value for loan_report_lbs.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ReportLbs{" +
                "id=" + id +
                ", filedName='" + filedName + '\'' +
                ", filedDesc='" + filedDesc + '\'' +
                ", filedValue='" + filedValue + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}