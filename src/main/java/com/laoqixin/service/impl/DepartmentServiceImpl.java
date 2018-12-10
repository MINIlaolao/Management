package com.laoqixin.service.impl;

import com.laoqixin.bean.Department;
import com.laoqixin.dao.DepartmentMapper;
import com.laoqixin.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  @项目名：  PersonnelManagementSystem
 *  @包名：    com.laoqixin.service.impl
 *  @文件名:   DepartmentServiceImpl
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/10 19:40
 *  @描述：    TODO
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private static final String TAG = "DepartmentServiceImpl";
    Department department;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department selectDepartmentById(Integer departId) {
        return departmentMapper.selectByPrimaryKey(departId);
    }

    @Override
    public int deleteDepartmentById(Integer departId) {
        return departmentMapper.deleteByPrimaryKey(departId);
    }

    @Override
    public List<Department> getList(){
        return departmentMapper.selectByDepartment(department);
    }

    @Override
    public int updateStaffById(Department department) {
        return departmentMapper.updateByPrimaryKey(department);
    }

}
