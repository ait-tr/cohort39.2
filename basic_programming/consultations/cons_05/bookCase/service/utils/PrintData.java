package bookCase.service.utils;

import bookCase.entiry.Book;
import bookCase.entiry.Bookcase;
import bookCase.entiry.BooksCollections;

public class PrintData {

    public void printBookCollections(BooksCollections booksCollections){
        Book[] books = booksCollections.getBooksCollections();

        for (int i = 0; i < books.length; i++) {
            System.out.println("---------------");
            System.out.println("Книга № " + books[i].getId());
            System.out.println("Автор книги: " + books[i].getBookAuthor());
            System.out.println("Название книги: " + books[i].getBookName());
        }
    }

    public void printBC(Bookcase bc){
        System.out.println("-------------");
        System.out.println("Книжный шкаф:");
        for (int i = 0; i < bc.getBookShelves().length; i++) {
            System.out.println("Книжная полка № " + (i + 1));
            for (int j = 0; j < bc.getBookShelves()[i].getBooksOnShelf().length; j++) {
                System.out.println("Книга: " + bc.getBookShelves()[i].getBooksOnShelf()[j]);
            }
        }
    }
}
