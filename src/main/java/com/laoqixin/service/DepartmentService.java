package com.laoqixin.service;

import com.laoqixin.bean.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 部门删除
     * @param departId
     * @return
     */
    int deleteByPrimaryKey(Integer departId);

    int insert(Department record);

    Department selectByPrimaryKey(Integer departId);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}
