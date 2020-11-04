package array;

public class ArrayMain {

    public static void main(String[] args) {

        System.out.println("\nDays: ");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[1]);
        System.out.println(days.length);

        System.out.println("\nPowers of 2: ");
        int[] powersOfTwo = new int[5];
        int pow = 1;

        for(int i = 0; i < powersOfTwo.length; i++) {

            powersOfTwo[i] = pow;
            pow *= 2;

            System.out.println(powersOfTwo[i]);
        }

        System.out.println("\nBoolean array:");
        boolean[] booleans = new boolean[6];
        boolean b = false;

        for(int j = 0; j < booleans.length; j++) {

            booleans[j] = b;
            b = !b;

            System.out.println(booleans[j]);
        }

        System.out.println("\nContains: ");
        int[] numbers = {2, 3, 6, 9, 5, 7, 12, 43, 1, 0};
        System.out.println(new ArrayHandler().contains(numbers, 4));
        System.out.println(new ArrayHandler().contains(numbers, 12));
        System.out.println(new ArrayHandler().contains(numbers, 0));
        System.out.println(new ArrayHandler().contains(numbers, 8));

        System.out.println("\nFind: ");
        int[] numbers2 = {2, 3, 6, 9, 5, 7, 12, 43, 1, 0};
        System.out.println(new ArrayHandler().find(numbers2, 4));
        System.out.println(new ArrayHandler().find(numbers2, 12));
        System.out.println(new ArrayHandler().find(numbers2, 0));
        System.out.println(new ArrayHandler().find(numbers2, 8));






    }


}
