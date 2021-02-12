package collectionscomp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        List<Book> books = new ArrayList<>(libraryBooks);
        Collections.sort(books);
        return books;
    }

    public List<Book> orderedByAuthor() {
        List<Book> books = new ArrayList<>(libraryBooks);
        Collections.sort(books, new AuthorComparator());
        return books;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> titles = new ArrayList<>();
        for (Book book : libraryBooks) {
            titles.add(book.getTitle());
        }
        Collator collator = Collator.getInstance(locale);
        //collator.setStrength(Collator.PRIMARY);
        Collections.sort(titles, collator);
        return titles;
    }
}
