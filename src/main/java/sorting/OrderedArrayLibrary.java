package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById() {
        Book[] result = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, result, 0, bookArray.length);
        Arrays.sort(result);
        return result;
    }

    public Book[] sortingByTitle() {
        Book[] result = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, result, 0, bookArray.length);
        Arrays.sort(result, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
        return result;
    }
}
