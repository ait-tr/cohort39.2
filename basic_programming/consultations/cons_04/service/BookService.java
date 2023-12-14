package service;

import entiry.Book;
import entiry.Books;
import lessoncode2.userInput.UserInput;

public class BookService {
    UserInput ui = new UserInput();
    private int totalNumberOfBooks;

    public BookService(int totalNumberOfBooks) {
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    private Book createBook(){

        int bookId = ui.userInterfaceInputInt("insert book id:");
        String bookAuthor = ui.userInterfaceInputText("insert book author: ");
        String bookName = ui.userInterfaceInputText("insert book name:");
        Book book = new Book(bookId,bookAuthor,bookName);
        return book;
    }
    private Books createBooksArray(){
        Books books = new Books(totalNumberOfBooks);
        return books;
    }

    public  Books fillBooksArrayFromUser(){
        Books books = createBooksArray();

        for (int i = 0; i < books.getBooks().length; i++) {
            books.getBooks()[i] = createBook();
        }
        return books;
    }

}
