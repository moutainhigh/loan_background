package com.xiaochong.loan.background.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class BorrowerAccountRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.borrower_banlance_id
     *
     * @mbggenerated
     */
    private Integer borrowerBanlanceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.operate_serial_no
     *
     * @mbggenerated
     */
    private String operateSerialNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.capital_money
     *
     * @mbggenerated
     */
    private BigDecimal capitalMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.capital_type
     *
     * @mbggenerated
     */
    private String capitalType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.capital_before_money
     *
     * @mbggenerated
     */
    private BigDecimal capitalBeforeMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.capital_after_money
     *
     * @mbggenerated
     */
    private BigDecimal capitalAfterMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.repayment_id
     *
     * @mbggenerated
     */
    private Integer repaymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.transaction_no
     *
     * @mbggenerated
     */
    private String transactionNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.result
     *
     * @mbggenerated
     */
    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.create_user
     *
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.update_user
     *
     * @mbggenerated
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.id
     *
     * @return the value of loan_borrower_account_record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_borrower_account_record.update_source
     *
     * @mbggenerated
     */
    private String updateSource;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUpdateSource() {
        return updateSource;
    }

    public void setUpdateSource(String updateSource) {
        this.updateSource = updateSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.id
     *
     * @param id the value for loan_borrower_account_record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.borrower_banlance_id
     *
     * @return the value of loan_borrower_account_record.borrower_banlance_id
     *
     * @mbggenerated
     */
    public Integer getBorrowerBanlanceId() {
        return borrowerBanlanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.borrower_banlance_id
     *
     * @param borrowerBanlanceId the value for loan_borrower_account_record.borrower_banlance_id
     *
     * @mbggenerated
     */
    public void setBorrowerBanlanceId(Integer borrowerBanlanceId) {
        this.borrowerBanlanceId = borrowerBanlanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.operate_serial_no
     *
     * @return the value of loan_borrower_account_record.operate_serial_no
     *
     * @mbggenerated
     */
    public String getOperateSerialNo() {
        return operateSerialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.operate_serial_no
     *
     * @param operateSerialNo the value for loan_borrower_account_record.operate_serial_no
     *
     * @mbggenerated
     */
    public void setOperateSerialNo(String operateSerialNo) {
        this.operateSerialNo = operateSerialNo == null ? null : operateSerialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.capital_money
     *
     * @return the value of loan_borrower_account_record.capital_money
     *
     * @mbggenerated
     */
    public BigDecimal getCapitalMoney() {
        return capitalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.capital_money
     *
     * @param capitalMoney the value for loan_borrower_account_record.capital_money
     *
     * @mbggenerated
     */
    public void setCapitalMoney(BigDecimal capitalMoney) {
        this.capitalMoney = capitalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.capital_type
     *
     * @return the value of loan_borrower_account_record.capital_type
     *
     * @mbggenerated
     */
    public String getCapitalType() {
        return capitalType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.capital_type
     *
     * @param capitalType the value for loan_borrower_account_record.capital_type
     *
     * @mbggenerated
     */
    public void setCapitalType(String capitalType) {
        this.capitalType = capitalType == null ? null : capitalType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.capital_before_money
     *
     * @return the value of loan_borrower_account_record.capital_before_money
     *
     * @mbggenerated
     */
    public BigDecimal getCapitalBeforeMoney() {
        return capitalBeforeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.capital_before_money
     *
     * @param capitalBeforeMoney the value for loan_borrower_account_record.capital_before_money
     *
     * @mbggenerated
     */
    public void setCapitalBeforeMoney(BigDecimal capitalBeforeMoney) {
        this.capitalBeforeMoney = capitalBeforeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.capital_after_money
     *
     * @return the value of loan_borrower_account_record.capital_after_money
     *
     * @mbggenerated
     */
    public BigDecimal getCapitalAfterMoney() {
        return capitalAfterMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.capital_after_money
     *
     * @param capitalAfterMoney the value for loan_borrower_account_record.capital_after_money
     *
     * @mbggenerated
     */
    public void setCapitalAfterMoney(BigDecimal capitalAfterMoney) {
        this.capitalAfterMoney = capitalAfterMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.repayment_id
     *
     * @return the value of loan_borrower_account_record.repayment_id
     *
     * @mbggenerated
     */
    public Integer getRepaymentId() {
        return repaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.repayment_id
     *
     * @param repaymentId the value for loan_borrower_account_record.repayment_id
     *
     * @mbggenerated
     */
    public void setRepaymentId(Integer repaymentId) {
        this.repaymentId = repaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.transaction_no
     *
     * @return the value of loan_borrower_account_record.transaction_no
     *
     * @mbggenerated
     */
    public String getTransactionNo() {
        return transactionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.transaction_no
     *
     * @param transactionNo the value for loan_borrower_account_record.transaction_no
     *
     * @mbggenerated
     */
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo == null ? null : transactionNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.result
     *
     * @return the value of loan_borrower_account_record.result
     *
     * @mbggenerated
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.result
     *
     * @param result the value for loan_borrower_account_record.result
     *
     * @mbggenerated
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.mark
     *
     * @return the value of loan_borrower_account_record.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.mark
     *
     * @param mark the value for loan_borrower_account_record.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.create_user
     *
     * @return the value of loan_borrower_account_record.create_user
     *
     * @mbggenerated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.create_user
     *
     * @param createUser the value for loan_borrower_account_record.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.create_time
     *
     * @return the value of loan_borrower_account_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.create_time
     *
     * @param createTime the value for loan_borrower_account_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.update_user
     *
     * @return the value of loan_borrower_account_record.update_user
     *
     * @mbggenerated
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.update_user
     *
     * @param updateUser the value for loan_borrower_account_record.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_borrower_account_record.update_time
     *
     * @return the value of loan_borrower_account_record.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_borrower_account_record.update_time
     *
     * @param updateTime the value for loan_borrower_account_record.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}