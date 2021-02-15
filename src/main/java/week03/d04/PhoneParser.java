package week03.d04;

import java.util.Scanner;

public class PhoneParser {

    public Phone parsePhone(String phoneNumber) {
        String prefix = phoneNumber.substring(0, phoneNumber.indexOf("-"));
        String number = phoneNumber.substring(phoneNumber.indexOf("-") + 1);
        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneParser parser = new PhoneParser();

        System.out.println("Add meg a telefonszámot a következő formátumban: 10-1234567");
        Phone phone = parser.parsePhone(scanner.nextLine());

        System.out.println("prefix: " + phone.getPrefix());
        System.out.println("number: " + phone.getNumber());
        System.out.println(phone);
    }
}
