package com.laoqixin.bean;

/*
 *  @项目名：  PersonnelManagementSystem
 *  @包名：    com.laoqixin.bean
 *  @文件名:   employee
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/10 14:49
 *  @描述：    TODO
 */
public class employee {
    private static final String TAG = "employee";
    private int emp_id;
    private String emp_name;
    private int    emp_age;
    private double emp_income;
    private String emp_depart;
    private String emp_position;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public double getEmp_income() {
        return emp_income;
    }

    public void setEmp_income(double emp_income) {
        this.emp_income = emp_income;
    }

    public String getEmp_depart() {
        return emp_depart;
    }

    public void setEmp_depart(String emp_depart) {
        this.emp_depart = emp_depart;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }
}
