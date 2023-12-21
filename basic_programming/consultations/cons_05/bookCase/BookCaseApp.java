package bookCase;

import bookCase.entiry.Book;
import bookCase.entiry.Bookcase;
import bookCase.entiry.BooksCollections;
import bookCase.service.*;
import bookCase.service.utils.PrintData;

public class BookCaseApp {
    public static void main(String[] args) {
        PrintData printData = new PrintData();
        PutBookOnShelf put = new PutBookOnShelf();
        RemoveBookOnShelf remove = new RemoveBookOnShelf();
        FindBook findBook = new FindBook();
        BookInput bookInput = new BookInput(12);
        BookCaseService bookCaseService = new BookCaseService();
        //-----------------------------------------------------------


        BooksCollections booksCollections = bookInput.inputBooksFromArray();
        printData.printBookCollections(booksCollections);

        // имеем bookCollections в котором хранятся все наши книги

        Bookcase bookcase = bookCaseService.createBookCase(3,4);

        // создан книжный шкаф в котором 3 полки на 4 книги на каждой полке, но они пустые
        // будем заполнять наши полки

        bookCaseService.fillBookCase(bookcase,booksCollections);

        printData.printBC(bookcase);

        //------- удалим книгу с полки ----


        Book bookForRemove1 = findBook.findByName("Сага о Форсайтах",bookcase);

        remove.removeBookFromShelf(bookForRemove1,bookcase);

        printData.printBC(bookcase);

       Book bookForRemove2 = findBook.findByName("Три мушкетера",bookcase);

        remove.removeBookFromShelf(bookForRemove2,bookcase);

        printData.printBC(bookcase);


        put.putBookOnTheShelf(bookForRemove1, 1, bookcase);
        printData.printBC(bookcase);

        put.putBookOnTheShelf(bookForRemove2, 2, bookcase);
        printData.printBC(bookcase);

        remove.swapBooksOnShelves(bookForRemove1, bookForRemove2,bookcase);
        printData.printBC(bookcase);

        //----------------------------


        remove.removeBookFromShelf(findBook.findByPlace(3,3,bookcase),bookcase);

        printData.printBC(bookcase);


        Book newBook = new Book(15,"Роберт Мартин", "Чистый код");
        put.putBookOnTheShelf(newBook,3,bookcase);
        printData.printBC(bookcase);

    }
}
