package recursion;

public class FactorialCalculator {

    public long getFactorial(int num) {
        if(num > 1) {
            return num * getFactorial(num - 1);
        }
        else {
            return 1;
        }
    }
}
