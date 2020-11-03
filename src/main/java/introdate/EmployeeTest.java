package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Név: ");
        String name = scanner.nextLine();

        System.out.println("Születési dátum (év hónap nap): ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Az alkalmazott adatai:");
        System.out.println("Név: " + employee.getName());
        System.out.println("Születési dátum: " + employee.getDateOfBirth());
        System.out.println("Belépés ideje: " + employee.getBeginEmployment());

    }
}
