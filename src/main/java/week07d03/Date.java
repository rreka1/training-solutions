package week07d03;

public class Date {

    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        if (isInvalidYear(year)) {
            throw new IllegalArgumentException("Invalid year! " + year);
        }
        if (isInvalidMonth(month)) {
            throw new IllegalArgumentException("Invalid month! " + month);
        }
        if (isInvalidDay(day)) {
            throw new IllegalArgumentException("Invalid day! " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
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

    public static Date of(int year, int month, int day) {
        return new Date(year, month, day);
    }

    public Date withYear(int year) {
        return Date.of(year, getMonth(), getDay());
    }

    public Date withMonth(int month) {
        return Date.of(getYear(), month, getDay());
    }

    public Date withDay(int day) {
        return Date.of(getYear(), getMonth(), day);
    }

    private boolean isInvalidYear(int year) {
        return year <= 0;
    }

    private boolean isInvalidMonth(int month) {
        return month < 1 || month > 12;
    }

    private boolean isInvalidDay(int day) {
        return day < 1 || day > 31;
    }
}
