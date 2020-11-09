package attributes.book;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Title:");
        String title = scanner.nextLine();

        Book book = new Book(title);
        System.out.println("object: " + book);
        System.out.println("title: " + book.getTitle());

        System.out.println("Title:");
        book.setTitle(scanner.nextLine());
        System.out.println("object: " + book);
        System.out.println("title: " + book.getTitle());
    }
}
