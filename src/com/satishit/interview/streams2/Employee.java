package com.satishit.interview.streams2;

public class Employee {
    Integer empNo;
    String empName;
    Integer salary;

    public Employee(Integer empNo, String empName, Integer salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empNo+"-"+empName+"-"+salary;
    }

}
