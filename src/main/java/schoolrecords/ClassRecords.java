package schoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student newStudent) {
        for (Student student : students) {
            if (student.getName().equals(newStudent.getName())) {
                return false;
            }
        }
        students.add(newStudent);
        return true;
    }

    public boolean removeStudent(Student studentToRemove) {
        for (Student student : students) {
            if (student.getName().equals(studentToRemove.getName())) {
                students.remove(studentToRemove);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sumOfStudentAverages = 0.0;
        for (Student student : students) {
            if (student.getMarks().isEmpty()) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sumOfStudentAverages += student.calculateAverage();
        }
        double average = sumOfStudentAverages / students.size();
        BigDecimal bd = new BigDecimal(average).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sumOfStudentAverages = 0.0;
        int counter = 0;
        for (Student student : students) {
            boolean studentHasMark = student.calculateSubjectAverage(subject) != 0.0;
            if (studentHasMark) {
                sumOfStudentAverages += student.calculateSubjectAverage(subject);
                counter++;
            }
        }
        double average = sumOfStudentAverages / counter;
        BigDecimal bd = new BigDecimal(average).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student : students) {
            String studentName = student.getName();
            double studentAverage = student.calculateAverage();
            result.add(new StudyResultByName(studentName, studentAverage));
        }
        return result;
    }

    public String listStudentNames() {
        if (students.isEmpty()) {
            throw new IllegalStateException("Student list must not be empty!");
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Student student : students) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(student.getName());
        }
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.isBlank();
    }
}
