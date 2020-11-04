package arraylist;

import classstructureconstructors.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<>();

    public void add(String book) {

        books.add(book);
    }

    public List<String> findAllByPrefix(String prefix) {

        List<String> samePrefix = new ArrayList<>();

        for (String book: books) {

            if(book.indexOf(prefix, 0) == 0) {

                samePrefix.add(book);
            }
        }
        return samePrefix;
    }

    public List<String> getTitles() {

        return books;
    }

    public void removeByPrefix(String prefix) {

        List<String> remove = new ArrayList<>();

        for (String book: books) {

            if(book.startsWith(prefix)) {

                //books.remove(book); ConcurrentModificationException
                remove.add(book);
            }
        }
        books.removeAll(remove);
    }

    //...
    public static void main(String[] args) {

        Books books = new Books();

        books.add("Antigoné");
        books.add("Egri csillagok");
        books.add("A kis herceg");
        books.add("Egri csillagok");

        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Egri"));

        books.removeByPrefix("Egri");
        System.out.println(books.getTitles());

    }
}