package searching;

public class Book implements Comparable<Book> {

    private int id;
    private String author;
    private String title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        int compareAuthor = this.author.compareTo(o.author);
        int compareTitle = this.title.compareTo(o.title);
        if (compareAuthor != 0) {
            return compareAuthor;
        } else {
            return compareTitle;
        }
    }

    @Override
    public String
    toString() {
        return id + " " + author + " " + title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}