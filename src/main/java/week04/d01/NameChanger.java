package week04.d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if(fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Invalid parameter: " + fullName);
        }
        else {
            this.fullName = fullName;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String firstName) {
        this.fullName = fullName.replace(fullName.substring(0, fullName.indexOf(" ")), firstName);
    }
}
