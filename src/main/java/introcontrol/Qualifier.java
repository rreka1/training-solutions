package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Szám: ");
        int num = scanner.nextInt();

        if (num > 100) {
            System.out.println("nagyobb, mint száz");
        } else {
            System.out.println("száz, vagy kisebb");
        }
    }
}
