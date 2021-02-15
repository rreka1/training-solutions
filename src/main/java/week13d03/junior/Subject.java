package week13d03.junior;

public class Subject {

    private String teacherName;
    private String subjectName;
    private String className;
    private int numOfLessons;

    public Subject(String teacherName, String subjectName, String className, int numOfLessons) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
        this.className = className;
        this.numOfLessons = numOfLessons;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getClassName() {
        return className;
    }

    public int getNumOfLessons() {
        return numOfLessons;
    }
}
