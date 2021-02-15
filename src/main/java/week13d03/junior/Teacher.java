package week13d03.junior;

import java.util.Objects;

public class Teacher{

    private String name;
    private int hour;

    public Teacher(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return name + ": " + hour;
    }

    public String getName() {
        return name;
    }

    public int getHour() {
        return hour;
    }
}
