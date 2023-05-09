package com.satishit.interview.streams5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Write a Code to Print Duplicate Employee name count from EmployeeList Using Java8.
        EMPId		Name		DEPT		Age
        ---------------------------------------------------
        E40001		PRADEEP		HR		36
        E40002		ASHOK		MANAGER		28
        E40003		PRADEEP		ASST MANAGER	28
        E40004		SANTOSH		STORE MANAGER	25
        E40005		ASHOK		GENERAL MANAGER	26 */

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("E40001","PRADEEP","HR",36));
        empList.add(new Employee("E40002","ASHOK","MANAGER",28));
        empList.add(new Employee("E40003","PRADEEP","ASST MANAGER",28));
        empList.add(new Employee("E40004","SANTOSH","STORE MANAGER",25));
        empList.add(new Employee("E40005","ASHOK","GENERAL MANAGER",26));

        //Count employee name using stream()
        Map<String,Long> nameCount =
                empList.stream().collect(Collectors.groupingBy(Employee::getName,
                        Collectors.counting()));
        System.out.println(nameCount);

        //Count employee name using Collection
        Map<String,Integer> map = new HashMap<>();
        for (Employee e : empList) {
            if (!map.containsKey(e.getName())){
                map.put(e.getName(),1);
            }else {
                map.put(e.getName(),map.get(e.getName()+1));
            }

        }
        System.out.println(map);
    }
}
