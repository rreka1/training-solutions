package stringconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if(isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        else{
            this.familyName = familyName;
            this.middleName = middleName;
            this.givenName = givenName;
            this.title = title;
        }
    }

    public Name(String familyName, String middleName, String givenName) {
        if(isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        else {
            this.familyName = familyName;
            this.middleName = middleName;
            this.givenName = givenName;
        }
    }

    public String concatNameWesternStyle() {
        String fullName = null;
        if(title != null) {
            fullName = title.getStr() + " " + givenName + " " + familyName;
            if(!isEmpty(middleName)) {
                fullName = title.getStr() + " " + givenName + " " + middleName + " "+ familyName;
            }
        }
        else {
            fullName = givenName + " " + familyName;
            if(!isEmpty(middleName)) {
                fullName = givenName + " " + middleName + " "+ familyName;
            }
        }
        return fullName;
    }

    public String concatNameHungarianStyle() {
        String fullName = null;
        if(title != null) {
            fullName = title.getStr().concat(" ").concat(familyName).concat(" ").concat(givenName);
            if(!isEmpty(middleName)) {
                fullName = title.getStr().concat(" ").concat(familyName).concat(" ").concat(middleName).concat(" ").concat(givenName);
            }
        }
        else {
            fullName = familyName.concat(" ").concat(givenName);
            if(!isEmpty(middleName)) {
                fullName = familyName.concat(" ").concat(middleName).concat(" ").concat(givenName);
            }
        }
        return fullName;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
}
