package bookCase.entiry;

import java.util.Arrays;

public class BooksCollections {
    private Book[] booksCollections;

    public BooksCollections(Integer totalNumberOfBooks) {
        this.booksCollections = new Book[totalNumberOfBooks];
    }

    public void setBooksCollections(Book[] booksCollections) {
        this.booksCollections = booksCollections;
    }

    public Book[] getBooksCollections() {
        return booksCollections;
    }
    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(booksCollections) +

                '}';
    }
}
