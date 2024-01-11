package libraryApp.repository;

import libraryApp.entity.Author;
import libraryApp.entity.Book;
import libraryApp.entity.ResponseEntity;

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

    public ResponseEntity findById(int bookId){
        ArrayList<Book> listOfFoundBooksForResponse = new ArrayList<>();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getBookId() == bookId) {
                listOfFoundBooksForResponse.add(repository.get(i));
            }
        }

        if (listOfFoundBooksForResponse.size() > 0){
            return new ResponseEntity(listOfFoundBooksForResponse, "Ok");
        } else {
            return new ResponseEntity(listOfFoundBooksForResponse, "Book not found");
        }
    }

    public ResponseEntity findByAuthor(Author authorForSearch){
        ArrayList<Book> listOfFoundBooksForResponse = new ArrayList<>();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getAuthor().equals(authorForSearch)) {
                listOfFoundBooksForResponse.add(repository.get(i));
            }
        }

        if (listOfFoundBooksForResponse.size() > 0){
            return new ResponseEntity(listOfFoundBooksForResponse, "Ok");
        } else {
            return new ResponseEntity(listOfFoundBooksForResponse, "Book not found");
        }
    }

    public ResponseEntity findByAuthor(String bookNameSearch){
        ArrayList<Book> listOfFoundBooksForResponse = new ArrayList<>();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getNameOfBook().equals(bookNameSearch)) {
                listOfFoundBooksForResponse.add(repository.get(i));
            }
        }

        if (listOfFoundBooksForResponse.size() > 0){
            return new ResponseEntity(listOfFoundBooksForResponse, "Ok");
        } else {
            return new ResponseEntity(listOfFoundBooksForResponse, "Book not found");
        }
    }

}
