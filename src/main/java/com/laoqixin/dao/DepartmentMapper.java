package com.laoqixin.dao;

import com.laoqixin.bean.Department;
import com.laoqixin.bean.DepartmentExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer departId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByDepartment(Department department);

    Department selectByPrimaryKey(Integer departId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}