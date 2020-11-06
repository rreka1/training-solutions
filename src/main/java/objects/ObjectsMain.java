package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        //Objektumok

        new Book(); //később nem lehet hozzáférni

        System.out.println(new Book()); //objects.Book@378bf509

        //System.out.println(Book emptyBook);

        Book emptyBook = null;
        System.out.println(emptyBook); //null

        System.out.println(emptyBook == null); //true

        Book book = new Book();
        System.out.println(book); //objects.Book@5fd0d5ae
        book = null;
        System.out.println(book); //null
        book = new Book();
        System.out.println(book); //objects.Book@2d98a335

        Book anotherBook = new Book();
        System.out.println(book == anotherBook); //false
        anotherBook = book;
        System.out.println(anotherBook); //objects.Book@2d98a335
        System.out.println(book == anotherBook); //true
        System.out.println(anotherBook instanceof Book); //true

        //Objektumok száma

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println(book1); //objects.Book@378bf509
        System.out.println(book2); //objects.Book@5fd0d5ae
        System.out.println(book3); //objects.Book@2d98a335

        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book5;

        book5 = new Book();
        System.out.println(book5); //objects.Book@16b98e56

        book6 = null;

        //4 objektum jön létre.
        //A futás végén 4 objektumhoz lehet hozzáférni.


        //Tömbök és kollekciók

        Book[] books = {book1, book2, book3};

        List<Book> bookList = Arrays.asList(book1, book2, book3);

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);

        System.out.println(Arrays.toString(books));
        System.out.println(bookList);
        System.out.println(list);

    }
}
