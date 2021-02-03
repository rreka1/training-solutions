package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String nameAndTitle : names) {
                String title = "";
                if (nameAndTitle.contains(".")) {
                    title = nameAndTitle.substring(0, nameAndTitle.indexOf("."));
                }
                pw.print(nameAndTitle + ": ");
                pw.println(calculateSalary(title));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private int calculateSalary(String title) {
        int salary = 0;
        if (title.equals("Dr")) {
            salary = 500_000;
        } else if (title.equals("Mr") || title.equals("Mrs")) {
            salary = 200_000;
        } else {
            salary = 100_000;
        }
        return salary;
    }
}
