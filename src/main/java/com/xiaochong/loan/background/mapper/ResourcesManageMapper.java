package com.xiaochong.loan.background.mapper;

import com.xiaochong.loan.background.entity.po.ResourcesManage;
import com.xiaochong.loan.background.entity.vo.ResourcesManagePage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourcesManageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_resources_manage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_resources_manage
     *
     * @mbggenerated
     */
    int insert(ResourcesManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_resources_manage
     *
     * @mbggenerated
     */
    int insertSelective(ResourcesManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_resources_manage
     *
     * @mbggenerated
     */
    ResourcesManage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_resources_manage
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ResourcesManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_resources_manage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ResourcesManage record);

    List<ResourcesManage> queryAllResources(@Param("type")Integer type);

    List<ResourcesManagePage> resourcesManagePage(@Param("resName")String resName,
                                                  @Param("resUrl")String resUrl,
                                                  @Param("parentId") Integer parentId,
                                                  @Param("type") Integer type);

    List<ResourcesManage> queryResources(@Param("userId") Integer userId,@Param("type")Integer type);
}