package com.xiaochong.loan.background.entity.po;

import java.util.Date;

public class AccountRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.order_status
     *
     * @mbggenerated
     */
    private String orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.merch_id
     *
     * @mbggenerated
     */
    private Integer merchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.transact_count
     *
     * @mbggenerated
     */
    private Integer transactCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.transact_type
     *
     * @mbggenerated
     */
    private String transactType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.create_by
     *
     * @mbggenerated
     */
    private Integer createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_account_record.update_by
     *
     * @mbggenerated
     */
    private Integer updateBy;

    private Date beginTime;

    private Date endTime;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.id
     *
     * @return the value of loan_account_record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.id
     *
     * @param id the value for loan_account_record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.order_no
     *
     * @return the value of loan_account_record.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.order_no
     *
     * @param orderNo the value for loan_account_record.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.order_status
     *
     * @return the value of loan_account_record.order_status
     *
     * @mbggenerated
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.order_status
     *
     * @param orderStatus the value for loan_account_record.order_status
     *
     * @mbggenerated
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.merch_id
     *
     * @return the value of loan_account_record.merch_id
     *
     * @mbggenerated
     */
    public Integer getMerchId() {
        return merchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.merch_id
     *
     * @param merchId the value for loan_account_record.merch_id
     *
     * @mbggenerated
     */
    public void setMerchId(Integer merchId) {
        this.merchId = merchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.transact_count
     *
     * @return the value of loan_account_record.transact_count
     *
     * @mbggenerated
     */
    public Integer getTransactCount() {
        return transactCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.transact_count
     *
     * @param transactCount the value for loan_account_record.transact_count
     *
     * @mbggenerated
     */
    public void setTransactCount(Integer transactCount) {
        this.transactCount = transactCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.transact_type
     *
     * @return the value of loan_account_record.transact_type
     *
     * @mbggenerated
     */
    public String getTransactType() {
        return transactType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.transact_type
     *
     * @param transactType the value for loan_account_record.transact_type
     *
     * @mbggenerated
     */
    public void setTransactType(String transactType) {
        this.transactType = transactType == null ? null : transactType.trim();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_account_record.create_time
     *
     * @return the value of loan_account_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_account_record.create_time
     *
     * @param createTime the value for loan_account_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}