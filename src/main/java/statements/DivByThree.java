package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy egész számot!");
        int szam = scanner.nextInt();

        boolean oszthato = (szam % 3 == 0);

        System.out.println( oszthato ? "Osztható 3-mal." : "Nem osztható 3-mal.");
    }
}
