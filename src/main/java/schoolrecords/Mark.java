package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        } else {
            this.subject = subject;
            this.tutor = tutor;
            this.markType = stringToMarkType(markType);
        }
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return markType.getDescription() + "(" + markType.getValue() + ")";
    }

    private MarkType stringToMarkType(String mark) {
        switch (mark) {
            case "5":
                return MarkType.A;
            case "4":
                return MarkType.B;
            case "3":
                return MarkType.C;
            case "2":
                return MarkType.D;
            case "1":
                return MarkType.F;
        }
        throw new IllegalArgumentException("Mark must be between 1 and 5!");
    }
}
