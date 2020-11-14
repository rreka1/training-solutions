package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle1 diameter:");
        int diameter1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Circle2 diameter:");
        int diameter2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Circle1 perimeter: " + new Circle(diameter1).perimeter());
        System.out.println("Circle1 area: " + new Circle(diameter1).area());
        System.out.println("Circle2 perimeter: " + new Circle(diameter2).perimeter());
        System.out.println("Circle2 area: " + new Circle(diameter2).area());
    }
}
