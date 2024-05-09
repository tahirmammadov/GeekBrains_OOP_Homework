package lesson_03.task_Comparable_Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // using ARRAY for testing
        System.out.println("------using Array for testing------");

        Employee[] employeesArray = new Employee[3];
        employeesArray[0] = new Employee("Fedor", 25, 13000);
        employeesArray[1] = new Employee("Dmitriy", 22, 25000);
        employeesArray[2] = new Employee("Aleksandr", 29, 56000);

        System.out.printf("Before sorting: %n");
        for(Employee employee: employeesArray){
            System.out.println(employee.toString());
        }

        // sorting by the age
        Arrays.sort(employeesArray);

        System.out.printf("After sorting by age: %n");
        for(Employee employee: employeesArray)
            System.out.println(employee.toString());

        // sorting by the salary
        Arrays.sort(employeesArray, new EmployeeSalaryComparator());
        // other option with using lambda expression:
        // Arrays.sort(employees, (employee1, employee2) -> Integer.compare(employee1.salary, employee2.salary));

        System.out.printf("After sorting by salary: %n");
        for(Employee employee: employeesArray)
            System.out.println(employee.toString());



        // using COLLECTION for testing
        System.out.println("------using Collection for testing------");

        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee("Ivan", 20, 35000));
        employeesList.add(new Employee("Sergey", 40, 40000));
        employeesList.add(new Employee("Petr", 30, 30000));

        //Iterator<Employee> iterator = employees.iterator();
        System.out.printf("Before sorting: %n");
        for(Employee employee: employeesList)
            System.out.println(employee.toString());

        // sorting by the age
        Collections.sort(employeesList);

        System.out.printf("After sorting by age: %n");
        for(Employee employee: employeesList)
            System.out.println(employee.toString());

        // sorting by the salary
        Collections.sort(employeesList, new EmployeeSalaryComparator());
        // other option with using lambda expression:
        // Collections.sort(employees, (employee1, employee2) -> Integer.compare(employee1.salary, employee2.salary));

        System.out.printf("After sorting by salary: %n");
        for(Employee employee: employeesList)
            System.out.println(employee.toString());
    }
}
