package lesson_03.task_Comparable_Comparator;

public class Employee implements Comparable<Employee>{
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee){
        return Integer.compare(this.age, employee.age);

//        2-nd option:
//        if(this.age > employee.age)
//            return 1;
//        else if(this.age < employee.age)
//            return -1;
//        else
//            return 0;
    }

    @Override
    public String toString(){
        return String.format("name: %s, age: %d, salary: %d", name, age, salary);
    }
}
