package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> gradeList = new ArrayList<>();

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public double average() {
        double sumOfGrades = 0.0;
        for (Integer grade : gradeList) {
            sumOfGrades += grade;
        }
        return sumOfGrades / gradeList.size();
    }

    public boolean isIncreasing() {
        for (int i = 1; i < gradeList.size(); i++) {
            Integer actual = gradeList.get(i - 1);
            Integer next = gradeList.get(i);
            if (next < actual) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }
}
