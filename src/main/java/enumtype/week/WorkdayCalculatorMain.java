package enumtype.week;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {

        WorkdayCalculator calculator = new WorkdayCalculator();

        System.out.println("Wednesday: " + Day.WEDNESDAY.getType());
        System.out.println("Sunday: " + Day.SUNDAY.getType());

        System.out.println("Friday + 9 days: " + calculator.dayTypes(Day.FRIDAY, 10));
        System.out.println("Monday-Sunday: " + calculator.dayTypes(Day.MONDAY, 7));
    }
}
