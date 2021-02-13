package sorting;

import java.util.Set;
import java.util.TreeSet;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = new TreeSet<>(library);
    }

    public Book lendFirstBook() {
        if (!library.isEmpty()) {
            for (Book book : library) {
                return book;
            }
        }
        throw new NullPointerException("Library is empty!");
    }
}
