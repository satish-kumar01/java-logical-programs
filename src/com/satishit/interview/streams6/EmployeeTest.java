package com.satishit.interview.streams6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/*Create an Employee class with given fields,
        Create EmployeeTest class and put those data below given,
        Questions
        ---------
            1) How many male and female employees are there in the organisation?
            2) Print the name of all department in the organisation?*/

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = getAllEmployeeData();

        //1) How many male and female employees are there in the organisation?
        Map<String, Long> collect1 =
                employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect1);

        //2) Print the name of all department in the organisation?
        Set<String> collect2 = employees.stream().map(e -> e.getDepartment()).collect(Collectors.toSet());
        System.out.println(collect2);

        Set<String> collect3 = employees.stream().map(e -> e.getGender()).collect(Collectors.toSet());
        System.out.println(collect3);

    }

    public static List<Employee> getAllEmployeeData(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111,"Jiya Brein",32,"Female","HR",2011,25000.0));
        employeeList.add(new Employee(122,"Paul Nikusi",25,"Male","sales",2015,13500.0));
        employeeList.add(new Employee(133,"Martin Theron",29,"Male","Infra",2012,18000.0));
        employeeList.add(new Employee(144,"Murali Gowda",28,"Male","Product",2014,32500.0));
        employeeList.add(new Employee(155,"Nima Roy",27,"Female","HR",2013,22700.0));
        employeeList.add(new Employee(166,"Iqbal Hussain",43,"Male","Security",2016,10500.0));
        employeeList.add(new Employee(177,"Manu Sharma",35,"Male","Account",2010,27000.0));
        employeeList.add(new Employee(188,"Wang Lieu",31,"Male","Product",2015,34500.0));
        employeeList.add(new Employee(199,"Amelia Zoe",24,"Female","sales",2016,11500.0));
        employeeList.add(new Employee(200,"Jaden Dough",38,"Male","Security",2015,11000.5));
        employeeList.add(new Employee(211,"Jasana Kaur",27,"Female","Infra",2014,15700.0));
        employeeList.add(new Employee(222,"Nitin Joshi",25,"Male","Product",2016,28200.0));
        employeeList.add(new Employee(233,"Jyothi Reddy",27,"Female","Account",2013,21300.0));
        employeeList.add(new Employee(244,"Nicolus Den",24,"Male","Sales",2017,10700.5));
        employeeList.add(new Employee(255,"Ali Baig",23,"Male","Infra",2018,12700.0));
        employeeList.add(new Employee(266,"Sanvi Pandey",26,"Female","Product",2015,28900.0));
        employeeList.add(new Employee(277,"Anuj Chettiar",31,"Male","Product",2012,35700.0));
        return employeeList;
    }
}
