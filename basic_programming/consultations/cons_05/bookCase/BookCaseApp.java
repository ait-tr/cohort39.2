package bookCase;

import bookCase.entiry.Bookcase;
import bookCase.entiry.BooksCollections;
import bookCase.service.BookCaseService;
import bookCase.service.BookInput;
import bookCase.service.utils.PrintData;

public class BookCaseApp {
    public static void main(String[] args) {
        PrintData printData = new PrintData();
        BookInput bookInput = new BookInput(12);
        BooksCollections booksCollections = bookInput.inputBooksFromArray();
        printData.printBookCollections(booksCollections);

        // имеем bookCollections в котором хранятся все наши книги

        BookCaseService bookCaseService = new BookCaseService();

        Bookcase bookcase = bookCaseService.createBookCase(3,4);

        // создан книжный шкаф в котором 3 полки на 4 книги на каждой полке, но они пустые
        // будем заполнять наши полки

        bookCaseService.fillBookCase(bookcase,booksCollections);

        printData.printBC(bookcase);

    }
}
