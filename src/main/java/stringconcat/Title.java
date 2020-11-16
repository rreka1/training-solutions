package stringconcat;

public enum Title {

    MR("Mr."),
    MS("Ms."),
    DR("Dr.");

    private final String str;

    Title(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
