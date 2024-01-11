package libraryApp.service;

import libraryApp.entity.Book;
import libraryApp.entity.ResponseEntity;
import libraryApp.entity.ResponseStatus;
import libraryApp.repository.BookRepository;
import libraryApp.service.InputOutput.InputData;
import libraryApp.service.searchUtil.BookIdMatcher;
import libraryApp.service.searchUtil.BookNameMatcher;

import java.util.ArrayList;
import java.util.List;

public class LibraryServices {

    BookRepository repository = new BookRepository();
    public List<Book> createLibrary() {
        return repository.getRepository();
    }

    public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd){
        InputData inputData = new InputData();
        for (int i = 0; i < numberOfElementsAdd; i++) {
            Book newBook = inputData.inputNewBook();
            ourLibrary.add(newBook);
        }
    }

    public List<Book> searchBookById(List<Book> ourLibrary, Integer searchCriteria){
        BookIdMatcher bookIdMatcher = new BookIdMatcher(searchCriteria);
        ResponseEntity response = repository.findBooks(bookIdMatcher);
        if (response.getStatus().equals(ResponseStatus.OK)){
            return response.getBooks();
        } else {
            System.out.println(response.getStatus().getMessage());
        }
        return new ArrayList<>();
    }

    public List<Book> searchBookByBookName(List<Book> ourLibrary, String searchCriteria){
        BookNameMatcher bookNameMatcher = new BookNameMatcher(searchCriteria);
        ResponseEntity response = repository.findBooks(bookNameMatcher);
        if (response.getStatus().equals(ResponseStatus.OK)){
            return response.getBooks();
        } else {
            System.out.println(response.getStatus().getMessage());
        }
        return new ArrayList<>();
    }



    public void deleteBook(List<Book> ourLibrary, List<Book> booksForDelete){
        for (int i = 0; i < booksForDelete.size(); i++) {
            ourLibrary.remove(booksForDelete.get(i));
        }
    }

    public void addElementIntoOurLibrary(List<Book> ourLibrary, Book newBook, boolean idHead){
        if (idHead) {
            ourLibrary.add(0,newBook);
        } else {
            ourLibrary.add(newBook);
        }
    }


}
