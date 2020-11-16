package stringbuilder;

public enum Title {

    MR("Mr."),
    MS("Ms."),
    DR("Dr."),
    PROF("Prof.");

    private final String str;

    Title(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
