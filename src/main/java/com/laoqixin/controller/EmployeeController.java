package com.laoqixin.controller;

import com.laoqixin.bean.Employee;
import com.laoqixin.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/*
 *  @项目名：  renyuanguanlixitong0.2
 *  @包名：    com.laoqixin.controller
 *  @文件名:   EmployeeController
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/13 9:33
 *  @描述：    TODO
 */
@Controller
public class EmployeeController {
//    @Autowired
//    EmployeeMapper employeeMapper;
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/ToshowEmployeeList")
    public String showEmployeeList(Model model)
    {
        List<Employee> employeeList = employeeService.selectAll();
        model.addAttribute("EmployeeList",employeeList);
        return "contro";//Employee/showEmployeeList;
    }
    @RequestMapping("/showToAdd")
    public String showToAdd()
    {
        return "Employee/add";
    }
    @RequestMapping(value = "/dealToAdd",method = RequestMethod.POST)
    public String dealToAdd(Model model,Integer addEmployeeId,String addEmployeeName,Integer addEmployeeAge,
    Double addEmployeeIncome,String addEmployeeDepart,String addEmployeePosition)
    {
        Employee employee = new Employee(addEmployeeId,addEmployeeName,addEmployeeAge,addEmployeeIncome,addEmployeeDepart,addEmployeePosition);
        employeeService.insert(employee);
        return "redirect:/ToshowEmployeeList";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(Integer empId)
    {
        employeeService.deleteByPrimaryKey(empId);
        return "redirect:/ToshowEmployeeList";
    }
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Model model,Integer empId,String empName,Integer empAge,
                                 Double empIncome,String empDepart,String empPosition)
    {
        model.addAttribute("updateEmployeeId",empId);
        model.addAttribute("updateEmployeeName",empName);
        model.addAttribute("updateEmployeeAge",empAge);
        model.addAttribute("updateEmployeeIncome",empIncome);
        model.addAttribute("updateEmployeeDepart",empDepart);
        model.addAttribute("updateEmployeePosition",empPosition);
        return "Employee/UpdateEmployee";
    }

    @RequestMapping(value = "/dealupdateEmployee",method = RequestMethod.POST)
    public String dealupdateEmployee(Model model,Integer updateByEmployeeId,String updateEmployeeName,Integer updateEmployeeAge,
                                     Double updateEmployeeIncome,String updateEmployeeDepart,String updateEmployeePostion)
    {
        Employee employee = new Employee(updateByEmployeeId,updateEmployeeName,updateEmployeeAge,updateEmployeeIncome,updateEmployeeDepart,updateEmployeePostion);
        employeeService.updateByPrimaryKey(employee);
        return "redirect:/ToshowEmployeeList";
    }

    @RequestMapping("selectEmployee")
    public String selectEmployee()
    {
        return "Employee/selectEmployeeJsp";
    }
    @RequestMapping(value = "dealselectEmployee",method = RequestMethod.POST)
    public String dealselectEmployee(Model model,Integer selectEmployeeId)
    {
        Employee employee = employeeService.selectByPrimaryKey(selectEmployeeId);
        model.addAttribute("selectEmployeeMsg",employee);
        return "Employee/selectSuccess";
    }

}
