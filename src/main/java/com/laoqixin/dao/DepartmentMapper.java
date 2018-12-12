package com.laoqixin.dao;

import com.laoqixin.bean.Department;
import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departId);

    int insert(Department record);

    Department selectByPrimaryKey(Integer departId);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}