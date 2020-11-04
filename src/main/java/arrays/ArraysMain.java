package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {

        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {

        List<String> days = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
        return days;
    }
    public String multiplicationTableAsString(int size) {

        int[][] table = new int[size][size];

        for(int i = 0; i < table.length; i++) {

            for(int j = 0; j < table[i].length; j++) {

                table[i][j] = (i+1) * (j+1);
            }
        }
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {

        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] megtettSzamok, int[] kihuzottSzamok) {

        int[] a = Arrays.copyOf(megtettSzamok, megtettSzamok.length);
        int[] b = Arrays.copyOf(kihuzottSzamok, kihuzottSzamok.length);

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {

        //...

        return false;
    }


    public static void main(String[] args) {

        ArraysMain a = new ArraysMain();

        System.out.println(a.numberOfDaysAsString());

        System.out.println(a.daysOfWeek());

        System.out.println(a.multiplicationTableAsString(8));

        System.out.println(a.sameTempValues(new double[] {2, 5}, new double[] {2, 5}));
        System.out.println(a.sameTempValues(new double[] {7, 8}, new double[] {2, 5}));

        System.out.println(a.wonLottery(new int[] {3, 6, 8, 7, 9}, new int[] {4, 2, 1, 7, 9}));
        System.out.println(a.wonLottery(new int[] {3, 6, 8, 7, 9}, new int[] {9, 8, 3, 7, 6}));

    }



}
