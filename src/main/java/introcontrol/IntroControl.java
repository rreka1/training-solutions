package introcontrol;

public class IntroControl {

    public int substractTenIfGreaterThanTen(int number) {

        if(number <= 10) {
            return number;
        } else {
            return number-10;
        }
    }

    public String describeNumber(int number) {

        if(number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {

        if(name.equals("Joe")) {
            return "Hello Joe!";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {

        int bonus = 0;

        if(sale >= 1_000_000) {
            bonus = sale / 10;
        }
        return bonus;
    }

    //...
    public int calculateConsumption(int prev, int next) {

        if(prev <= next) {
            return next - prev;
        }
        else {
            return 10000 - prev + next;
        }
    }

    public void printNumbers(int max) {

        for(int i = 0; i <= max; i++) {

            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {

        if((min >= 0) && (max >=0) ) {

            for(int i = min+1; i < max; i++) {

                System.out.println(i);
            }
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {

        if(a < b) {

            for(int i = a+1; i < b; i++) {

                System.out.println(i);
            }
        } else {

            for (int i = a-1; i > b; i--) {

                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max) {

        for(int i = 1; i <= max; i+=2) {

            System.out.println(i);
        }
    }

}
