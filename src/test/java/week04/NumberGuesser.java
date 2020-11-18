package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        int number = new Random().nextInt(100) + 1;
        System.out.println("Találd ki a számot (1-100-ig)!");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        while(guess != number) {
            if(guess < number) {
                System.out.println("Ennél nagyobb szám!");
            }
            else if(guess > number) {
                System.out.println("Ennél kisebb szám!");
            }
            guess = scanner.nextInt();
        }
        System.out.println("Gratulálok, kitaláltad!");
    }
}
