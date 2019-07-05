package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.RoleManage;
import com.xiaochong.loan.background.entity.vo.RoleManageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleManageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_role_manage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_role_manage
     *
     * @mbggenerated
     */
    int insert(RoleManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_role_manage
     *
     * @mbggenerated
     */
    int insertSelective(RoleManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_role_manage
     *
     * @mbggenerated
     */
    RoleManage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_role_manage
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RoleManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_role_manage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RoleManage record);

    List<RoleManageVo> roleManagePage();

    RoleManage getByUserId(@Param("userId") Integer userId);
}