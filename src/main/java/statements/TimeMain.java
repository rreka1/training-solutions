package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az első időpont: (óra perc másodperc szóközökkel elválasztva)");

        int ora = scanner.nextInt();
        int perc = scanner.nextInt();
        int masodperc = scanner.nextInt();

        Time time1 = new Time(ora, perc, masodperc);

        System.out.println("A második időpont: (óra perc másodperc szóközökkel elválasztva)");

        ora = scanner.nextInt();
        perc = scanner.nextInt();
        masodperc = scanner.nextInt();

        Time time2 = new Time(ora, perc, masodperc);

        System.out.println("Az első időpont " + time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második? " + time1.earlierThan(time2));

    }
}
