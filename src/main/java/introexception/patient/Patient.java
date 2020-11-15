package introexception.patient;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        if(!name.equals("") && name != null) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException();
        }
        if(year >= 1900) {
            this.yearOfBirth = year;
        }
        else {
            throw new IllegalArgumentException();
        }

        boolean isValidSSN = false;
        for(int i = 0; ssn.length() == 9 && i < ssn.length(); i++) {
            isValidSSN = true;
            if(!Character.isDigit(ssn.charAt(i))) {
                isValidSSN = false;
                break;
            }
        }
        if(isValidSSN) {
            this.socialSecurityNumber = ssn;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
