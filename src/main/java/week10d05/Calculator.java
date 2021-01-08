package week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static final int MAX_NUMBER_FOR_SUM = 4;

    //junior-mid
    public int findMinSum(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < MAX_NUMBER_FOR_SUM && i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("A legkisebbek összege: " + sum);
        return sum;
    }


    //senior
    public void findMinMaxSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null!");
        }
        int minSum = 0;
        int maxSum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < Math.min(MAX_NUMBER_FOR_SUM, arr.length); i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - 1 - i];
        }
        System.out.printf("minSum: %d%nmaxSum: %d%n", minSum, maxSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String s = scanner.nextLine();
        while (!s.isBlank()) {
            try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException nfe) {
                System.err.println("Számot adj meg!");
            }
            s = scanner.nextLine();
        }
        int[] arr = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            arr[i] = numbers.get(i);
        }
        new Calculator().findMinMaxSum(arr);
    }
}


