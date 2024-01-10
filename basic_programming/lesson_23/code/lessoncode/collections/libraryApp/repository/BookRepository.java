package collections.libraryApp.repository;

import collections.libraryApp.entity.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookRepository {

    private List<Book> repository = new LinkedList<>();

    public BookRepository() {

    }

    public List<Book> getRepository() {
        return repository;
    }
}
