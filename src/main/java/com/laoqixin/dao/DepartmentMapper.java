package com.laoqixin.dao;

import com.laoqixin.bean.Department;
import java.util.List;

/**
 * @author Laoqixin
 */
public interface DepartmentMapper {
    /**
     *
     * @param departId
     * @return
     */
    int deleteByPrimaryKey(Integer departId);

    /**
     *
     * @param record
     * @return
     */
    int insert(Department record);

    /**
     *
     * @param departId
     * @return
     */
    Department selectByPrimaryKey(Integer departId);

    /**
     *
     * @return
     */
    List<Department> selectAll();

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Department record);
}