package com.laoqixin.bean;

public class Employee {
    public Employee(Integer empId,
                    String empName,
                    Integer empAge,
                    Double empIncome,
                    String empDepart,
                    String empPosition)
    {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empIncome = empIncome;
        this.empDepart = empDepart;
        this.empPosition = empPosition;
    }

    public Employee() {

    }

    private Integer empId;

    private String empName;

    private Integer empAge;

    private Double empIncome;

    private String empDepart;

    private String empPosition;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Double getEmpIncome() {
        return empIncome;
    }

    public void setEmpIncome(Double empIncome) {
        this.empIncome = empIncome;
    }

    public String getEmpDepart() {
        return empDepart;
    }

    public void setEmpDepart(String empDepart) {
        this.empDepart = empDepart == null ? null : empDepart.trim();
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition == null ? null : empPosition.trim();
    }
}