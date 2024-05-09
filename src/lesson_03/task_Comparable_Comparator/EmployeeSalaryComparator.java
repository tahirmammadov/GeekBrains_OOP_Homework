package lesson_03.task_Comparable_Comparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2){
        return Integer.compare(employee1.salary, employee2.salary);

//        2-nd option:
//        if (employee1.salary > employee2.salary)
//            return 1;
//        else if(employee1.salary < employee2.salary)
//            return -1;
//        else
//            return 0;

    }
}
