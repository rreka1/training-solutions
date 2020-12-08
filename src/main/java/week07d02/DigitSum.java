package week07d02;

public class DigitSum {

    public static int sumOfDigits(int x) {
        String num = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            String digit = String.valueOf(num.charAt(i));
            sum += Integer.parseInt(digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(DigitSum.sumOfDigits(232426));
    }
}
