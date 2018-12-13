package com.laoqixin.service.impl;

import com.laoqixin.bean.Employee;
import com.laoqixin.dao.EmployeeMapper;
import com.laoqixin.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 *  @项目名：  renyuanguanlixitong0.2
 *  @包名：    com.laoqixin.service.impl
 *  @文件名:   EmployeeServiceImpl
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/13 8:56
 *  @描述：    TODO
 */
@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> selectAll() {
        return  employeeMapper.selectAll();
    }

    @Override
    public Employee selectByPrimaryKey(Integer empId) {
        return employeeMapper.selectByPrimaryKey(empId);
    }

    @Override
    public void deleteByPrimaryKey(Integer empId) {
        employeeMapper.deleteByPrimaryKey(empId);
    }

    @Override
    public void updateByPrimaryKey(Employee record) {
        employeeMapper.updateByPrimaryKey(record);
    }

    @Override
    public void insert(Employee record) {
        employeeMapper.insert(record);
    }
}
