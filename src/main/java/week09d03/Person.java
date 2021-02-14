package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent() {
        Random rnd = new Random();
        int index;
        if (age > 14) {
            index = rnd.nextInt(Present.values().length - 1) + 1;
        } else {
            index = rnd.nextInt(Present.values().length - 1);
        }
        this.present = Present.values()[index];
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }
}
