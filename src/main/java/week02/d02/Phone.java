package week02.d02;

import java.util.Scanner;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type;
        int mem;

        System.out.println("Phone1 type:");
        type = scanner.nextLine();
        System.out.println("Phone1 memory:");
        mem = scanner.nextInt();
        scanner.nextLine();

        Phone phone1 = new Phone(type, mem);

        System.out.println("Phone2 type:");
        type = scanner.nextLine();
        System.out.println("Phone2 memory:");
        mem = scanner.nextInt();

        Phone phone2 = new Phone(type, mem);

        System.out.println("Phone1: " + phone1.getType() + " " + phone1.getMem() + " GB");
        System.out.println("Phone2: " + phone2.getType() + " " + phone2.getMem() + " GB");

    }
}
