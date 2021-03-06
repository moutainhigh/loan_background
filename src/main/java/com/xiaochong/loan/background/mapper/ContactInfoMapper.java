package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.ContactInfo;

import java.util.List;

public interface ContactInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_contact_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_contact_info
     *
     * @mbggenerated
     */
    int insert(ContactInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_contact_info
     *
     * @mbggenerated
     */
    int insertSelective(ContactInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_contact_info
     *
     * @mbggenerated
     */
    ContactInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_contact_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ContactInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_contact_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ContactInfo record);

    List<ContactInfo> listByContactInfo(ContactInfo contactInfo);

    ContactInfo getByContactInfo(ContactInfo contactInfo);
}