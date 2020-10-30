package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.println("A következő adatokkal regisztrált: " + "név: " + name + ", email: " + email);

    }
}
