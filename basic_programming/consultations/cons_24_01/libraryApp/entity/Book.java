package libraryApp.entity;

public class Book {

    private int bookId;

    private libraryApp.entity.Author author;

    private String nameOfBook;

    public Book(int bookId, libraryApp.entity.Author author, String nameOfBook) {
        this.bookId = bookId;
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public int getBookId() {
        return bookId;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author=" + author +
                ", nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
}
