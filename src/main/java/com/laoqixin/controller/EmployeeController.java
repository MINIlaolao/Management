package com.laoqixin.controller;

import com.laoqixin.bean.Employee;
import com.laoqixin.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "showEmployeeList";
    }
    @RequestMapping("/showToAdd")
    public String showToAdd()
    {
        return "/add";
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
        return "UpdateEmployee";
    }

    @RequestMapping("/dealupdateEmployee")
    public String dealupdateEmployee(Model model,Integer empId,String empName,Integer empAge,
                                     Double empIncome,String empDepart,String empPosition)
    {
//        Employee employee = new Employee(empId,empName,empAge,empIncome,empDepart,empPosition);
//        加入构造方法后可去除
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setEmpName(empName);
        employee.setEmpAge(empAge);
        employee.setEmpIncome(empIncome);
        employee.setEmpDepart(empDepart);
        employee.setEmpPosition(empPosition);
        employeeService.updateByPrimaryKey(employee);
        return "redirect:/ToshowEmployeeList";
    }



}
