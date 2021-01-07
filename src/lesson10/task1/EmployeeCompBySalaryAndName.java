package lesson10.task1;

import java.util.Comparator;

public class EmployeeCompBySalaryAndName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Double salary1 = o1.getSalary();
        Double salary2 = o2.getSalary();
        if (salary1.equals(salary2)) {
            String name1 = o1.getFirstName();
            String name2 = o2.getFirstName();
            return name1.compareTo(name2);
        }
        return salary1.compareTo(salary2);
    }
}
