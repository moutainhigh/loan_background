package com.xiaochong.loan.background.entity.po;

public class CountNum {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_count_num.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_count_num.count_value
     *
     * @mbggenerated
     */
    private Integer countValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_count_num.count_type
     *
     * @mbggenerated
     */
    private String countType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_count_num.id
     *
     * @return the value of loan_count_num.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_count_num.id
     *
     * @param id the value for loan_count_num.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_count_num.count_value
     *
     * @return the value of loan_count_num.count_value
     *
     * @mbggenerated
     */
    public Integer getCountValue() {
        return countValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_count_num.count_value
     *
     * @param countValue the value for loan_count_num.count_value
     *
     * @mbggenerated
     */
    public void setCountValue(Integer countValue) {
        this.countValue = countValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_count_num.count_type
     *
     * @return the value of loan_count_num.count_type
     *
     * @mbggenerated
     */
    public String getCountType() {
        return countType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_count_num.count_type
     *
     * @param countType the value for loan_count_num.count_type
     *
     * @mbggenerated
     */
    public void setCountType(String countType) {
        this.countType = countType == null ? null : countType.trim();
    }
}