package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        StringBuilder sb = new StringBuilder();
        if(isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(title != null) {
            sb.append(title.getStr()).append(" ");
        }
        sb.append(givenName);
        if(!isEmpty(middleName)) {
            sb.append(" ").append(middleName);
        }
        sb.append(" ").append(familyName);
        return sb.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        StringBuilder sb = new StringBuilder();
        if(isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(title != null) {
            sb.append(title.getStr()).append(" ");
        }
        sb.append(familyName);
        if(!isEmpty(middleName)) {
            sb.append(" ").append(middleName);
        }
        sb.append(" ").append(givenName);
        return sb.toString();
    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder sb = new StringBuilder(name);
        sb.insert(name.indexOf(where)+1, title.getStr().concat(" "));
        return sb.toString();
    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder sb = new StringBuilder(name);
        sb.delete(name.indexOf(delete), name.lastIndexOf(delete)+delete.length());
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
