package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Szerző: ");
        String author = scanner.nextLine();

        System.out.print("Cím: ");
        String title = scanner.nextLine();

        System.out.print("Regisztrációs szám: ");
        String regNumber = scanner.nextLine();

        Book book = new Book(author, title);
        book.register(regNumber);

        System.out.println("Szerző: " + book.getAuthor() + " Cím: " + book.getTitle() + " (Reg.szám: " + book.getRegNumber() + ")");

    }
}
