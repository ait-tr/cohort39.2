package library;

public class Book {

    String author;
    String name;
    int pages;
    String catalogNumber;
    boolean isInStorage;

    public Book(String author, String name, int pages, String catalogNumber, boolean isInStorage) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.catalogNumber = catalogNumber;
        this.isInStorage = isInStorage;
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", isInStorage=" + isInStorage +
                '}';
    }
}
