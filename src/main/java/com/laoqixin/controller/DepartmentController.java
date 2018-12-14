package com.laoqixin.controller;

import com.laoqixin.bean.Department;
import com.laoqixin.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/showDepartment")
    public String showDepartment(Model model){
        List<Department> ls = departmentService.selectAll();
        model.addAttribute("depart",ls);
        return "Department/depart";
    }

    @RequestMapping("/showDepartmentById")
    public String showDepartmentById(Model model,Integer departId){
        Department department = departmentService.selectByPrimaryKey(departId);
        model.addAttribute("depart_id",department);
        return "Department/departId";
    }

    @RequestMapping("/insertDepartment")
    public String insertDepartment(Model model,Integer departId,String departName){
        Department department = new Department();
        department.setDepartId(departId);
        department.setDepartName(departName);
        Integer er = departmentService.insert(department);
        if(er>0){
            System.out.print("添加成功");
        }
        return null;
    }

    @RequestMapping("/updateById")
    public String updateById(Integer departId,String departName){
        Department department = new Department();
        department.setDepartId(departId);
        department.setDepartName(departName);
        Integer er = departmentService.updateByPrimaryKey(department);
        if(er>0){
            System.out.print("更新成功");
        }
        return "Department/depart";
    }

    @RequestMapping("/deleteById")
    public  String deleteById(Integer departId){
        Integer er = departmentService.deleteByPrimaryKey(departId);
        if(er>0) {
            System.out.print("删除成功");
        }
        return "Department/depart";
    }

}
