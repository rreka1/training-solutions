package stringbasic.pets;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate yearOfBirth;
    private Gender gender;
    private String regNumber;

    public Pet(String name, LocalDate yearOfBirth, Gender gender, String regNumber) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        if(regNumber.length() == 6) {
            this.regNumber = regNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid regNumber length: " + regNumber);
        }

    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
