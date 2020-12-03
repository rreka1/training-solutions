package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! " + year + ", " + month + ", " + day);
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        boolean correctYear = false;
        boolean correctMonth = false;
        boolean correctDay = false;
        if (year >= 1900) {
            correctYear = true;
        }
        if (month > 0 && month < 12) {
            correctMonth = true;
        }
        if (calculateMonthLength(year, month) == day) {
            correctDay = true;
        }
        return correctYear && correctMonth && correctDay;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0);
    }

    private int calculateMonthLength(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }
}
