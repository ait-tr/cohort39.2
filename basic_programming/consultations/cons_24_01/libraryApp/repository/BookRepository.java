package libraryApp.repository;

import libraryApp.entity.Author;
import libraryApp.entity.Book;
import libraryApp.entity.ResponseEntity;
import libraryApp.service.searchUtil.BookMatcher;

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

    public ResponseEntity findBooks(BookMatcher matcher){
        ArrayList<Book> listOfFoundBooksForResponse = new ArrayList<>();
        for (Book book : repository) {
            if (matcher.match(book)) {
                listOfFoundBooksForResponse.add(book);
            }
        }

        String status = listOfFoundBooksForResponse.isEmpty() ? "Book not found" : "Ok";

        return new ResponseEntity(listOfFoundBooksForResponse, status);

    }


}
