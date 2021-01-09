package schoolrecords;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String tutorName, List<Subject> taughtSubjects) {
        this.name = tutorName;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject taughtSubject : taughtSubjects) {
            if (taughtSubject.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }
}
