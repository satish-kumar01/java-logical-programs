package com.satishit.interview.streams8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* Get Details of Highest Paid Employee using Java8
        List of Employee who joined after 2014 using Java8. */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee>  employeeList = Arrays.asList(
                new Employee(28,"ABC",50000,"HR","Male",2014),
                new Employee(26,"PQR",51000,"Tech","Female",2015),
                new Employee(33,"LMN",60000,"HR","Male",2017),
                new Employee(29,"XYZ",89000,"Ops","Female",2014));

        System.out.println("Get Details of Highest Paid Employee");
        String nameOfHighestPaidEmployee = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary)).get().getName();
        System.out.println(nameOfHighestPaidEmployee);

        System.out.println("List of Employee who joined after 2014");
        List<Employee> listOfEmployeeWhoJoinedAfter2014 =
                employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2014).toList();
        System.out.println(listOfEmployeeWhoJoinedAfter2014);

    }

}
