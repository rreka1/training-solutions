package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void readGradesFromFile(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(" ");
                String name = studentData[0];
                List<Integer> gradeList = new ArrayList<>();
                for (int i = 1; i < studentData.length; i++) {
                    gradeList.add(Integer.parseInt(studentData[i]));
                }
                students.add(new Student(name, gradeList));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file");
        }
    }

    public double classAverage() {
        double sumOfGrades = 0.0;
        for (Student student : students) {
            sumOfGrades += student.average();
        }
        return sumOfGrades / students.size();
    }
}
