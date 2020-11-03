package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg 5 db számot:");

        int sum = 0;

        for(int i = 0; i < 5; i++) {

            int number = scanner.nextInt();
            scanner.nextLine();

            sum += number;
        }

        System.out.println("A számok összege: " + sum);
    }
}
