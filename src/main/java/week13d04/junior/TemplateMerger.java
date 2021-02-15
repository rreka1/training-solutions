package week13d04.junior;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {
        try {
            String template = Files.readString(file);
            StringBuilder sb = new StringBuilder();
            for (Employee employee : employees) {
                String replaced = template.replace("{nev}", employee.getName());
                replaced = replaced.replace("{ev}", Integer.toString(employee.getYearOfBirth()));
                sb.append(replaced).append("\n"); //fluent api
            }
            return sb.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        TemplateMerger templateManager = new TemplateMerger();
        Path path = Path.of("employee_template.txt");
        Employee employee1 = new Employee("John Doe", 1980);
        Employee employee2 = new Employee("Jack Doe", 1990);
        Employee employee3 = new Employee("Jane Doe", 1970);
        List<Employee> employees = List.of(employee1, employee2, employee3);

        String result = templateManager.merge(path, employees);
        System.out.println(result);
    }
}
