package lesson10.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Ivanov", 4000);
        Employee employee2 = new Employee("Alex", "Pupkin", 4000);
        Employee employee3 = new Employee("Peter", "Sidorov", 5000);
        Employee employee4 = new Employee("Ivan", "Comrades", 6000);

        List<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        Collections.sort(employees);
        System.out.println(employees);

        Comparator<Employee> comparator = new EmployeeCompBySalaryAndName();
        employees.sort(comparator);
        System.out.println(employees);

    }
}
