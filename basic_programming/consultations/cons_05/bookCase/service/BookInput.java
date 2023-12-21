package bookCase.service;

import bookCase.entiry.Book;
import bookCase.entiry.BooksCollections;

public class BookInput {
    private int totalNumberOfBooks;

    public BookInput(int totalNumberOfBooks) {
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    private BookService bs = new BookService(totalNumberOfBooks);


    public BooksCollections inputBooksFromUser() {
        BooksCollections booksCollections = bs.fillBooksArrayFromUser();
        return booksCollections;
    }

    public BooksCollections inputBooksFromArray() {
        totalNumberOfBooks = 12;
        BooksCollections booksCollections = new BooksCollections(totalNumberOfBooks);
        booksCollections.setBooksCollections(createBookArray());
        return booksCollections;
    }

    private Book[] createBookArray() {
        Book book1 = new Book(1, "Дюма", "Три мушкетера");
        Book book2 = new Book(2, "Жуль Верн", "80 тысяч лье под водой");
        Book book3 = new Book(3, "Булгаков", "Белая гвардия");
        Book book4 = new Book(4, "Пушкин", "Руслан и Людмила");
        Book book5 = new Book(5, "Гоголь", "Вечера на хуторе близ Диканьки");
        Book book6 = new Book(6, "Джек Лондон", "Белый клык");
        Book book7 = new Book(7, "Голсуорси", "Сага о Форсайтах");
        Book book8 = new Book(8, "Т. Драйзер", "Финасист");
        Book book9 = new Book(9, "Автор1", "Книга1");
        Book book10 = new Book(10, "Автор2", "Книга2");
        Book book11 = new Book(11, "Автор3", "Книга3");
        Book book12 = new Book(12, "Автор4", "Книга4");

        Book[] books = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11,book12};
        return books;
    }

    private Book[] createBookArrayFromFile(){
        Book[] books = new Book[totalNumberOfBooks];

        // логика для заполнения массива из файла

        return books;
    }
}
