package week14d03.junior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook() {
        List<Student> studentsCopy = new ArrayList<>(students);
        Collections.sort(studentsCopy);
        return studentsCopy;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
