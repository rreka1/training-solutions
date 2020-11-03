package stringtype.registration;

import java.util.Scanner;
import stringtype.registration.UserValidator;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();

        System.out.println("Felhasználónév: ");
        String userName = scanner.nextLine();

        System.out.println("Jelszó: ");
        String password1 = scanner.nextLine();

        System.out.println("Jelszó mégegyszer: ");
        String password2 = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("username: " + (validator.isValidUserName(userName) ? "valid" : "invalid"));
        System.out.println("password: " + (validator.isValidPassword(password1, password2) ? "valid" : "invalid"));
        System.out.println("email: " + (validator.isValidEmail(email) ? "valid" : "invalid"));

    }
}
