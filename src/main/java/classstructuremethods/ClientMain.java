package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.print("Név: ");
        client.setName(scanner.nextLine());

        System.out.print("Születési év: ");
        client.setYear(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Cím: ");
        client.setAddress(scanner.nextLine());

        System.out.println("Név: " + client.getName() + ", Születési év: " + client.getYear() + ", Cím: " + client.getAddress());

        System.out.print("Új cím: ");
        client.migrate(scanner.nextLine());
        System.out.println(client.getName() + " új címe: " + client.getAddress());
    }
}
