package bookCase.service;

import bookCase.entiry.Book;
import bookCase.entiry.Bookcase;
import bookCase.entiry.BooksCollections;
import bookCase.entiry.Bookshelf;

public class BookCaseService {

    public Bookcase createBookCase(int totalNumberOfShelves, int numberOfBooks){
        Bookcase newBookCase = new Bookcase(totalNumberOfShelves, numberOfBooks);
        return newBookCase;
    }

    public void fillBookCase(Bookcase bookcase, BooksCollections booksCollections){

        int numberOfShelves = bookcase.getBookShelves().length;
        int numberBooksOnShelf = bookcase.getBookShelves()[0].getBooksOnShelf().length;

        int counter = 0;

        for (int i = 0; i < numberOfShelves; i++) {
            for (int j = 0; j < numberBooksOnShelf; j++) {
                bookcase.getBookShelves()[i].getBooksOnShelf()[j] = booksCollections.getBooksCollections()[counter];
                counter++;
            }
        }
    }

}
