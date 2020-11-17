package filesscanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void loadFromFile() {
        try(Scanner scanner = new Scanner(Book.class.getResourceAsStream("/books.csv")).useDelimiter(";|(\r\n)")) {
            while(scanner.hasNext()) {
                String regNum = scanner.next();
                String author = scanner.next();
                String title = scanner.next();
                int yearOfPublish = scanner.nextInt();
                Book book = new Book(regNum, author, title, yearOfPublish);
                books.add(book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
