package com.satishit.java8.predicate.employeemanagement;

//Employee Management Application
public class Employee {
    String name;
    String designation;
    double salary;
    String city;

    //Constructor to perform initilization
    public Employee(String name,String designation,double salary,String city){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.city=city;
    }
    /*public String toString(){
        return name+":"+designation+":"+salary+":"+city; //[Satish:ceo:30000.0:Chennai]
    }*/
    public String toString(){
        //[Satish,ceo,30000.000000,Chennai]
        //[(Satish,ceo,30000.000000,Chennai)]
        //[(Satish,ceo,30000.00,Chennai)]
        String s = String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
        return s;
    }
    //to represent CEO we are going to use predicate isEquals()
    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        if (name.equals(e.name) && designation.equals(e.designation) && salary==e.salary && city==e.city){
            return true;
        }else {
            return false;
        }
    }

}
