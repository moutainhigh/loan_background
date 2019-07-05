package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.UrgeOverdue;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UrgeOverdueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_urge_overdue
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_urge_overdue
     *
     * @mbggenerated
     */
    int insert(UrgeOverdue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_urge_overdue
     *
     * @mbggenerated
     */
    int insertSelective(UrgeOverdue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_urge_overdue
     *
     * @mbggenerated
     */
    UrgeOverdue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_urge_overdue
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UrgeOverdue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_urge_overdue
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UrgeOverdue record);

    List<UrgeOverdue> selectByUrgeOverDue(UrgeOverdue urgeOverdue);

    UrgeOverdue selectByBorrowerId();

    List<Integer> selectBorrowerIdsByStatus(String status);

    void updateByBorrowerId(UrgeOverdue urgeOverdueForUpdate);

    List<Map<String,Object>> selectCountByUrgeOverdue(UrgeOverdue urgeOverdue);

    UrgeOverdue selectByApplicationId(Integer applicationId);

    List<Integer> selectApplicationIdsByStatus(@Param("status") String status);

    void updateByApplicationId(UrgeOverdue urgeOverdueForUpdate);
}