package bookCase.service;

import bookCase.entiry.Book;
import bookCase.entiry.Bookcase;
import bookCase.entiry.Bookshelf;

public class RemoveBookOnShelf {


    public boolean removeBookFromShelf(Book book, Bookcase bookcase) {
        Bookshelf[] allShelves = bookcase.getBookShelves();

        Integer shelfWhereBookIs = findShelfWhereBookIs(book, allShelves);

        if (shelfWhereBookIs >= 0) {
            removeBook(book, shelfWhereBookIs, bookcase);
            return true;
        } else {
            System.out.println("Книга не найдена!");
            return false;
        }
    }

    private Integer findShelfWhereBookIs(Book book, Bookshelf[] allShelves) {
        for (int i = 0; i < allShelves.length; i++) {
            Book[] books = allShelves[i].getBooksOnShelf();
            Integer bookIndexOnTheShelf = getBookIndexOnTheShelf(book, books);
            if (bookIndexOnTheShelf >= 0) return i;
        }
        return -1;
    }

    private Integer getBookIndexOnTheShelf(Book book, Book[] books) {
        for (int j = 0; j < books.length; j++) {
            if (books[j] != null && book.equals(books[j])) {
                return j;
            }
        }
        return -1;
    }

    private void removeBook(Book book, Integer shelfWhereBookIs, Bookcase bookcase){
        Book[] books = bookcase.getBookShelves()[shelfWhereBookIs].getBooksOnShelf();
        Integer bookIndexOnTheShelf = getBookIndexOnTheShelf(book, books);
        books[bookIndexOnTheShelf] = null;
    }


    public boolean swapBooksOnShelves(Book book1, Book book2, Bookcase bookcase){
        int shelfForBook1 = findShelfWhereBookIs(book1, bookcase.getBookShelves());
        int shelfForBook2 = findShelfWhereBookIs(book2, bookcase.getBookShelves());
        int book1Index = getBookIndexOnTheShelf(book1, bookcase.getBookShelves()[shelfForBook1].getBooksOnShelf());
        int book2Index = getBookIndexOnTheShelf(book2, bookcase.getBookShelves()[shelfForBook2].getBooksOnShelf());

        bookcase.getBookShelves()[shelfForBook1].getBooksOnShelf()[book1Index] = book2;
        bookcase.getBookShelves()[shelfForBook2].getBooksOnShelf()[book2Index] = book1;

        return true;

    }
}
