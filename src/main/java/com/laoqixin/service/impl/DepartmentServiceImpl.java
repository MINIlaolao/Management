package com.laoqixin.service.impl;

import com.laoqixin.bean.Department;
import com.laoqixin.dao.DepartmentMapper;
import com.laoqixin.service.DepartmentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("DepartmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {


    private  DepartmentMapper departmentMapper;

    public int deleteByPrimaryKey(Integer departId){return departmentMapper.deleteByPrimaryKey(departId);};

    public int insert(Department record){return  departmentMapper.insert(record);};

    public Department selectByPrimaryKey(Integer departId){return departmentMapper.selectByPrimaryKey(departId);};

    public List<Department> selectAll(){return  departmentMapper.selectAll();};

    public int updateByPrimaryKey(Department record){return departmentMapper.updateByPrimaryKey(record);};
}
