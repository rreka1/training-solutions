package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String operationString = "(2 + 5 * (4 - 6)) / 3";
        System.out.println(operationString + "     számítás eredménye:");

        double correctResult = (double) (2 + 5 * (4 - 6)) / 3;
        double userResult = scanner.nextDouble();
        boolean isCorrect = Math.abs(correctResult -userResult) < 0.0001;

        System.out.println("Felhasználó válasza: " + userResult + (isCorrect ? " Helyes válasz!" : " Helytelen válasz!"));
        System.out.println("Helyes válasz: " + correctResult);
    }
}
