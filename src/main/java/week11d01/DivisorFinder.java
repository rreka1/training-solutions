package week11d01;

public class DivisorFinder {

    public int findDivisors(int n) {
        int numOfDivisors = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(Character.toString(number.charAt(i)));
            if (digit != 0 && n % digit == 0) {
                numOfDivisors++;
            }
        }
        return numOfDivisors;
    }
}
