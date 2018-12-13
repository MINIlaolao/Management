package com.laoqixin.service;

import com.laoqixin.bean.Employee;
import com.laoqixin.dao.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  @项目名：  人员管理系统0.1
 *  @包名：    com.laoqixin.service
 *  @文件名:   EmployeeService
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/11 21:38
 *  @描述：    编写增删改查的业务层 实现dao中的接口方法
 */
@Service
public interface EmployeeService {
    static final String TAG = "EmployeeService";
    @Autowired
     EmployeeMapper mEmployeeMapper = null;

    /**
     * 查询所有员工（分页查询）
     * @return
     * ma
     */
    public List<Employee> selectAll() ;


    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    public Employee selectByPrimaryKey(Integer empId);

    /**
     * 根据id删除员工信息
     * @param empId
     */
    public void deleteByPrimaryKey(Integer empId);
    /**
     * 修改员工信息
     * @param record
     */
    public void  updateByPrimaryKey(Employee record);

    /**
     * 增加员工信息
     * @param record
     */
    public void  insert(Employee record);

}
