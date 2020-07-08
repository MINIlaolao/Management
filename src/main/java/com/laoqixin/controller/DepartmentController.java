package com.laoqixin.controller;

import com.laoqixin.bean.Department;
import com.laoqixin.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Laoqixin
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/showDepartment")
    public String showDepartment(Model model){
        List<Department> ls = departmentService.selectAll();
        model.addAttribute("depart",ls);
        return "Department/showDepartmentList";
    }
    @RequestMapping("/showDepartmentById")
    public String showDepartmentById(){
        return "Department/departById";
    }
    @RequestMapping("/dealShowDepartmentById")
    public String showDepartmentById(Model model,Integer departId){
        Department department = departmentService.selectByPrimaryKey(departId);
        model.addAttribute("selectDepartmentById",department);
        return "Department/successShowDepart";
    }

   @RequestMapping("/dealInsertDepartment")
    public String insertDepartment(Model model,Integer departId,String departName){
        Department department = new Department(departId,departName);
        Integer er = departmentService.insert(department);
        if(er>0){
            model.addAttribute("successInsertMsg","添加成功");
        }else {
            model.addAttribute("errorInsertMsg","添加失败");
        }
        return "redirect:/showDepartment";
    }

    @RequestMapping("/insertDepartment")
    public String insertDepartment(){return "Department/insertDepart";}
    @RequestMapping("/UpdateById")
    public String updateById(Model model,Integer departId,String departName){
        model.addAttribute("updateDepartId",departId);
        model.addAttribute("updateDepartName",departName);
        return "Department/updateDepartment";
    }
    @RequestMapping("/dealUpdateById")
    public String updateById(Integer departById,String departName){
        Department department = new Department(departById,departName);
        Integer er = departmentService.updateByPrimaryKey(department);
        if(er>0){
            System.out.print("更新成功");
        }
        return "redirect:/showDepartment";
    }

    @RequestMapping("/deleteById")
    public  String deleteById(Integer departId){
        Integer er = departmentService.deleteByPrimaryKey(departId);
        if(er>0) {
            System.out.print("删除成功");
        }
        return "redirect:/showDepartment";
    }

}
