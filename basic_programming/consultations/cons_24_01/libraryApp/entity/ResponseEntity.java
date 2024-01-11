package libraryApp.entity;

import java.util.List;

public class ResponseEntity {
    private List<Book> books;
    private String error;

    public ResponseEntity(List<Book> books, String error) {
        this.books = books;
        this.error = error;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getError() {
        return error;
    }
}
