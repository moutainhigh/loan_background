package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.RepaymentSerialRecord;

import java.util.List;
import java.util.Map;

public interface RepaymentSerialRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_repayment_serial_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_repayment_serial_record
     *
     * @mbggenerated
     */
    int insert(RepaymentSerialRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_repayment_serial_record
     *
     * @mbggenerated
     */
    int insertSelective(RepaymentSerialRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_repayment_serial_record
     *
     * @mbggenerated
     */
    RepaymentSerialRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_repayment_serial_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RepaymentSerialRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_repayment_serial_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RepaymentSerialRecord record);

    List<RepaymentSerialRecord> selectByRepaymentSerialRecord(RepaymentSerialRecord repaymentSerialRecord);

    List<Map<String, Object>> selectCountByRepaymentSerialRecord(RepaymentSerialRecord repaymentSerialRecord);

    void updateBorrowerIdById(RepaymentSerialRecord repaymentSerialRecordForUpdate);

    String selectStatusById(Integer id);
}