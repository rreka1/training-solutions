package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg két egész számot!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Művelet: " + num1 + " + " + num2);
        System.out.println("Eredmény: " + sum);

    }
}
