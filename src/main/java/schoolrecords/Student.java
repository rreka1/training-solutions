package schoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0;
        }
        double sumOfMarks = 0;
        for (Mark mark : marks) {
            sumOfMarks += mark.getMarkType().getValue();
        }
        double average = sumOfMarks / (double) marks.size();
        BigDecimal bd = new BigDecimal(average).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double calculateSubjectAverage(Subject subject) {
        if (marks.isEmpty()) {
            return 0;
        }
        double sumOfMarks = 0;
        double counter = 0;
        boolean foundSubject = false;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                foundSubject = true;
                sumOfMarks += mark.getMarkType().getValue();
                counter++;
            }
        }
        if (!foundSubject) {
            return 0;
        }
        double average = sumOfMarks / counter;
        BigDecimal bd = new BigDecimal(average).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getName() + " marks: ");
        for (Mark mark : marks) {
            String subjectName = mark.getSubject().getSubjectName() + ": ";
            String markDescription = mark.getMarkType().getDescription();
            String markValue = "(" + mark.getMarkType().getValue() + ")";
            sb.append(subjectName);
            sb.append(markDescription);
            sb.append(markValue);
        }
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.isBlank();
    }
}
