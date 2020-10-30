package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.print("Név: ");
        client.name = scanner.nextLine();

        System.out.print("Születési év: ");
        client.year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cím: ");
        client.address = scanner.nextLine();

        System.out.println("Ügyfél adatai: név: " + client.name + ", születési év: " + client.year + ", cím: " + client.address);

    }
}
