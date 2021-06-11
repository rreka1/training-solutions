package lambdastreams.bookstore;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public long getNumberOfBooks() {
        return books.stream().reduce(0, (a, b) -> a + b.getPieces(), Integer::sum);
    }

    public Optional<Book> findNewestBook() {
        //return books.stream().max(Comparator.comparingInt(Book::getYearOfPublish));
        return books.stream().max((a, b) -> a.getYearOfPublish() - b.getYearOfPublish());
    }

    public int getTotalValue() {
        return books.stream().reduce(0, (a, b) -> a + b.getPieces() * b.getPrice(), Integer::sum);
    }

    public List<Book> getByYearOfPublish(int year) {
        return books.stream().collect(Collectors.groupingBy(Book::getYearOfPublish)).get(year);
    }
}
