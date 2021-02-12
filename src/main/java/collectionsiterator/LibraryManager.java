package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        for (Iterator<Book> iterator = libraryBooks.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.getRegNumber() == regNumber) {
                return book;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        for (Iterator<Book> iterator = libraryBooks.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.getRegNumber() == regNumber) {
                iterator.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> books = new HashSet<>();
        for (Iterator<Book> iterator = libraryBooks.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.getAuthor().equals(author)) {
                books.add(book);
            }
        }
        if (books.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
        return books;
    }
}
