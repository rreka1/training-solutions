package intromethods;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 2010, 400_000);
        System.out.println(employee);
        employee.raiseSalary(100_000);
        System.out.println(employee);
    }
}
