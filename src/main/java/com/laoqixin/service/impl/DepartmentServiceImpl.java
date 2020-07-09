package com.laoqixin.service.impl;

import com.laoqixin.bean.Department;
import com.laoqixin.dao.DepartmentMapper;
import com.laoqixin.service.DepartmentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Laoqixin
 */
@Service("DepartmentService")
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {this.departmentMapper = departmentMapper;}

    @Override
    public int deleteByPrimaryKey(Integer departId){return departmentMapper.deleteByPrimaryKey(departId);}
    @Override
    public int insert(Department record){return  departmentMapper.insert(record);};
    @Override
    public Department selectByPrimaryKey(Integer departId){return departmentMapper.selectByPrimaryKey(departId);}
    @Override
    public List<Department> selectAll(){
        return  departmentMapper.selectAll();
    }
    @Override
    public int updateByPrimaryKey(Department record){return departmentMapper.updateByPrimaryKey(record);}
}
