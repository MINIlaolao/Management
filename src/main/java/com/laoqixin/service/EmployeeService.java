package com.laoqixin.service;

import com.laoqixin.bean.Employee;

import java.util.List;

/*
 *  @项目名：  人员管理系统0.1
 *  @包名：    com.laoqixin.service
 *  @文件名:   EmployeeService
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/11 21:38
 *  @描述：    编写增删改查的业务层 实现dao中的接口方法
 */

/**
 * @author Laoqixin
 */
public interface EmployeeService {
    /**
     * 查询所有员工（分页查询）
     * @return
     */
     List<Employee> selectAll();
    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
     Employee selectByPrimaryKey(Integer empId);
    /**
     * 根据id删除员工信息
     * @param empId
     */
     void deleteByPrimaryKey(Integer empId);
    /**
     * 修改员工信息
     * @param record
     */
     void  updateByPrimaryKey(Employee record);

    /**
     * 增加员工信息
     * @param record
     */
     void  insert(Employee record);

}
