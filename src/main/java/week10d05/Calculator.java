package week10d05;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    //junior-mid
    public int findMinSum(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < numbersToSum(arr.length); i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    private int numbersToSum(int arrLength) {
        int numbersToSum = 0;
        if (arrLength >= 4) {
            numbersToSum = 4;
        } else {
            numbersToSum = arrLength;
        }
        return numbersToSum;
    }


    //senior
    public MinMaxSum findMinMaxSum(int[] arr) {
        int minSum = 0;
        int maxSum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < numbersToSum(arr.length); i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - 1 - i];
        }
        System.out.println(minSum);
        System.out.println(maxSum);
        return new MinMaxSum(minSum, maxSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tömb elemszáma:");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        System.out.println("Tömb elemei:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        new Calculator().findMinMaxSum(arr);
    }
}

class MinMaxSum {
    private int minSum;
    private int maxSum;

    public MinMaxSum(int minSum, int maxSum) {
        this.minSum = minSum;
        this.maxSum = maxSum;
    }

    public int getMinSum() {
        return minSum;
    }

    public int getMaxSum() {
        return maxSum;
    }
}

