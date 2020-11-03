package introcontrol;

import java.util.Scanner;

public class IntroControlMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IntroControl a = new IntroControl();

        System.out.println(a.substractTenIfGreaterThanTen(14));
        System.out.println(a.substractTenIfGreaterThanTen(9));
        System.out.println(a.describeNumber(6));
        System.out.println(a.describeNumber(0));
        System.out.println(a.greetingToJoe("Joe"));
        System.out.println(a.greetingToJoe("asd"));
        System.out.println(a.calculateBonus(1500000));
        System.out.println(a.calculateBonus(999999));
        System.out.println(a.calculateConsumption(5236, 3285));
        System.out.println(a.calculateConsumption(5236, 9285));

        a.printNumbers(40);
        a.printNumbersBetween(20, 30);
        a.printNumbersBetweenAnyDirection(40,50);
        a.printNumbersBetweenAnyDirection(50,40);
        a.printOddNumbers(31);

    }
}
