package week14d03.junior;

import java.util.*;

public class Student implements Comparable<Student>{

    private final String name;
    private final Map<String, List<Integer>> grades = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String subject, int grade) {
        if (!grades.containsKey(subject)) {
            grades.put(subject, new ArrayList<>());
        }
        grades.get(subject).add(grade);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getGrades() {
        return Collections.unmodifiableMap(grades);
    }
}
