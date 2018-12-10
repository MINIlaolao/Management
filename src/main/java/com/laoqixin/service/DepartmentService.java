package com.laoqixin.service;

import com.laoqixin.bean.Department;

import java.util.List;

/*
 *  @项目名：  PersonnelManagementSystem
 *  @包名：    com.laoqixin.service
 *  @文件名:   DepartmentService
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/10 19:16
 *  @描述：    TODO
 */
public interface DepartmentService {
    /**
     * 根据部门id查询部门信息
     * @param departId
     * @return
     */
    Department selectDepartmentById(Integer departId);

    /**
     * 根据id删除部门信息
     * @param departId
     */
    int deleteDepartmentById(Integer departId);

    /**
     * 显示所有部门信息
     * @return
     */
    List<Department> getList();

    /**
     * 删除部门信息
     * @param department
     */
    int updateStaffById(Department department);
}
