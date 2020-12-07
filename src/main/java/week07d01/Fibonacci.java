package week07d01;

public class Fibonacci {

    public static long fib(int n) {
        int f1 = 0;
        int f2 = 1;
        int count = 0;
        while (count < n) {
            f2 += f1;
            f1 = f2 - f1;
            count++;
        }
        return f1;
    }
}
