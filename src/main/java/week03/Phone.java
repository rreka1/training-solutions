package week03;

/*
 * Írj egy Phone oszályt, melynek van egy prefix és egy number String attribútuma!
 * Írj egy PhoneParser osztályt egy parse(String) metódussal, ami beolvas egy 10-1234567 formátumú szöveget,
 * és visszaad egy Phone objektumot, feltöltve a prefix értékét 10, a number értékét 1234567 értékekkel!
 * */

public class Phone {

    private String prefix;
    private String number;

    public Phone(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "prefix='" + prefix + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
