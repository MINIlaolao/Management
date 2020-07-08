package com.laoqixin.dao;

import com.laoqixin.bean.Employee;
import java.util.List;

/**
 * @author Laoqixin
 */
public interface EmployeeMapper {
    /**
     *
     * @param empId
     * @return
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     *
     * @param record
     * @return
     */
    int insert(Employee record);

    /**
     *
     * @param empId
     * @return
     */
    Employee selectByPrimaryKey(Integer empId);

    /**
     *
     * @return
     */
    List<Employee> selectAll();

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Employee record);
}