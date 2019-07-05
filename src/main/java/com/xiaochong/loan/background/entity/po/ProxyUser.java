package com.xiaochong.loan.background.entity.po;

import java.util.Date;

public class ProxyUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.pwd
     *
     * @mbggenerated
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.merch_id
     *
     * @mbggenerated
     */
    private Integer merchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_proxy_user.is_master
     *
     * @mbggenerated
     */
    private String isMaster;


    private String firstLogin;

    public String getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(String firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.id
     *
     * @return the value of loan_proxy_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.id
     *
     * @param id the value for loan_proxy_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.username
     *
     * @return the value of loan_proxy_user.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.username
     *
     * @param username the value for loan_proxy_user.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.pwd
     *
     * @return the value of loan_proxy_user.pwd
     *
     * @mbggenerated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.pwd
     *
     * @param pwd the value for loan_proxy_user.pwd
     *
     * @mbggenerated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.email
     *
     * @return the value of loan_proxy_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.email
     *
     * @param email the value for loan_proxy_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.phone
     *
     * @return the value of loan_proxy_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.phone
     *
     * @param phone the value for loan_proxy_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.status
     *
     * @return the value of loan_proxy_user.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.status
     *
     * @param status the value for loan_proxy_user.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.merch_id
     *
     * @return the value of loan_proxy_user.merch_id
     *
     * @mbggenerated
     */
    public Integer getMerchId() {
        return merchId;
    }

    public void setMerchId(Integer merchId) {
        this.merchId = merchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_proxy_user.is_master
     *
     * @return the value of loan_proxy_user.is_master
     *
     * @mbggenerated
     */
    public String getIsMaster() {
        return isMaster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_proxy_user.is_master
     *
     * @param isMaster the value for loan_proxy_user.is_master
     *
     * @mbggenerated
     */
    public void setIsMaster(String isMaster) {
        this.isMaster = isMaster == null ? null : isMaster.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "ProxyUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", createtime=" + createtime +
                ", lastLoginTime=" + lastLoginTime +
                ", merchId=" + merchId +
                ", isMaster='" + isMaster + '\'' +
                ", firstLogin='" + firstLogin + '\'' +
                '}';
    }
}