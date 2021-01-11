package week11d01;

public class DivisorFinder {

    public int findDivisors(int n) {
        int numOfDivisors = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(number.substring(i, i + 1));
            if (num != 0) {
                if (n % num == 0) {
                    numOfDivisors++;
                }
            }
        }
        return numOfDivisors;
    }
}
