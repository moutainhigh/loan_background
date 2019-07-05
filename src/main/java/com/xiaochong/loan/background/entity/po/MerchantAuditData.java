package com.xiaochong.loan.background.entity.po;

import java.util.Date;

public class MerchantAuditData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_audit_data.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_audit_data.application_id
     *
     * @mbggenerated
     */
    private Integer applicationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_audit_data.audit_content
     *
     * @mbggenerated
     */
    private String auditContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_audit_data.audit_time
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_audit_data.audit_by
     *
     * @mbggenerated
     */
    private Integer auditBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_merchant_audit_data.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_audit_data.id
     *
     * @return the value of loan_merchant_audit_data.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_audit_data.id
     *
     * @param id the value for loan_merchant_audit_data.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_audit_data.application_id
     *
     * @return the value of loan_merchant_audit_data.application_id
     *
     * @mbggenerated
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_audit_data.application_id
     *
     * @param applicationId the value for loan_merchant_audit_data.application_id
     *
     * @mbggenerated
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_audit_data.audit_content
     *
     * @return the value of loan_merchant_audit_data.audit_content
     *
     * @mbggenerated
     */
    public String getAuditContent() {
        return auditContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_audit_data.audit_content
     *
     * @param auditContent the value for loan_merchant_audit_data.audit_content
     *
     * @mbggenerated
     */
    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent == null ? null : auditContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_audit_data.audit_time
     *
     * @return the value of loan_merchant_audit_data.audit_time
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_audit_data.audit_time
     *
     * @param auditTime the value for loan_merchant_audit_data.audit_time
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_audit_data.audit_by
     *
     * @return the value of loan_merchant_audit_data.audit_by
     *
     * @mbggenerated
     */
    public Integer getAuditBy() {
        return auditBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_audit_data.audit_by
     *
     * @param auditBy the value for loan_merchant_audit_data.audit_by
     *
     * @mbggenerated
     */
    public void setAuditBy(Integer auditBy) {
        this.auditBy = auditBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_merchant_audit_data.status
     *
     * @return the value of loan_merchant_audit_data.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_merchant_audit_data.status
     *
     * @param status the value for loan_merchant_audit_data.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}