package week14d03.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    Student student = new Student("John Doe");

    @Test
    void addGradeTest() {
        student.addGrade("math", 2);
        student.addGrade("math", 1);
        student.addGrade("math", 5);
        student.addGrade("biology", 5);
        student.addGrade("biology", 4);
        assertEquals(2, student.getGrades().size());
        assertEquals(List.of(2, 1, 5), student.getGrades().get("math"));
        assertEquals(5, student.getGrades().get("math").get(2));
        assertEquals(List.of(5, 4), student.getGrades().get("biology"));
        assertEquals(5, student.getGrades().get("biology").get(0));
    }
}