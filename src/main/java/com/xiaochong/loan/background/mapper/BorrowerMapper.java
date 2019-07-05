package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.Borrower;

import java.util.List;

public interface BorrowerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_borrower
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_borrower
     *
     * @mbggenerated
     */
    int insert(Borrower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_borrower
     *
     * @mbggenerated
     */
    int insertSelective(Borrower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_borrower
     *
     * @mbggenerated
     */
    Borrower selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_borrower
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Borrower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_borrower
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Borrower record);

    List<Integer> selectBorrowerId(Borrower record);

    List<Borrower> selectBorrower(Borrower record);

    List<Borrower> selectBorrowerByPhoneOrIdCard(Borrower borrower);
}