package week02.project;

import java.util.Scanner;

public class Controller {

    private Office office;

    public void readOffice(int db) {

        Scanner scanner = new Scanner(System.in);
        Office office = new Office();
        this.office = office;

        for(int i = 0; i < db; i++) {
            System.out.println("Tárgyaló neve:");
            String name = scanner.nextLine();

            System.out.println("Hosszúsága (m):");
            int length = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Szélessége (m):");
            int width = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }
    }

    public void printMenu() {

        System.out.println("________________MENÜ_______________");
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
    }

    public void runMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdja meg a kiválasztott menüpont számát!");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch(number) {
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:
                office.printEvenNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.println("Adja meg a keresett nevet!");
                office.printMeetingRoomsWithName(scanner.nextLine());
                break;
            case 6:
                System.out.println("Adja meg a keresett névtöredéket!");
                office.printMeetingRoomsContains(scanner.nextLine());
                break;
            case 7:
                System.out.println("Adja meg a minimum területet (m2)!");
                office.printAreasLargerThan(scanner.nextInt());
                break;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Hány darab tárgyalót szeretne rögzíteni?");
        int db = scanner.nextInt();
        scanner.nextLine();

        controller.readOffice(db);
        controller.printMenu();
        controller.runMenu();

    }
}
