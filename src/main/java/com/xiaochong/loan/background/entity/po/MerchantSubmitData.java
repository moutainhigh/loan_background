package com.xiaochong.loan.background.entity.po;

import java.util.Date;

public class MerchantSubmitData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_submit_data.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_submit_data.borrower_id
     *
     * @mbggenerated
     */
    private Integer applicationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_submit_data.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_submit_data.submit_by
     *
     * @mbggenerated
     */
    private Integer submitBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_submit_data.submit_time
     *
     * @mbggenerated
     */
    private Date submitTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_submit_data.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_submit_data.id
     *
     * @return the value of loan_merchant_submit_data.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_submit_data.id
     *
     * @param id the value for loan_merchant_submit_data.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_submit_data.borrower_id
     *
     * @return the value of loan_merchant_submit_data.borrower_id
     *
     * @mbggenerated
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_submit_data.mark
     *
     * @return the value of loan_merchant_submit_data.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_submit_data.mark
     *
     * @param mark the value for loan_merchant_submit_data.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_submit_data.submit_by
     *
     * @return the value of loan_merchant_submit_data.submit_by
     *
     * @mbggenerated
     */
    public Integer getSubmitBy() {
        return submitBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_submit_data.submit_by
     *
     * @param submitBy the value for loan_merchant_submit_data.submit_by
     *
     * @mbggenerated
     */
    public void setSubmitBy(Integer submitBy) {
        this.submitBy = submitBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_submit_data.submit_time
     *
     * @return the value of loan_merchant_submit_data.submit_time
     *
     * @mbggenerated
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_submit_data.submit_time
     *
     * @param submitTime the value for loan_merchant_submit_data.submit_time
     *
     * @mbggenerated
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_submit_data.status
     *
     * @return the value of loan_merchant_submit_data.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_submit_data.status
     *
     * @param status the value for loan_merchant_submit_data.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}