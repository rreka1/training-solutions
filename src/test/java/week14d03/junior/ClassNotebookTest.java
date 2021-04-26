package week14d03.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    ClassNotebook classNotebook = new ClassNotebook(List.of(
            new Student("C"),
            new Student("A"),
            new Student("D"),
            new Student("B")
    ));

    @Test
    void sortNotebookTest() {
        assertEquals("C", classNotebook.getStudents().get(0).getName());

        assertEquals("A", classNotebook.sortNotebook().get(0).getName());
        assertEquals("B", classNotebook.sortNotebook().get(1).getName());
        assertEquals("C", classNotebook.sortNotebook().get(2).getName());
        assertEquals("D", classNotebook.sortNotebook().get(3).getName());

        assertEquals("C", classNotebook.getStudents().get(0).getName());
        assertEquals("A", classNotebook.getStudents().get(1).getName());
        assertEquals("D", classNotebook.getStudents().get(2).getName());
        assertEquals("B", classNotebook.getStudents().get(3).getName());
    }
}