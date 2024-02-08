package bookReader.service;

import bookReader.entity.Book;

public class BookValidator {

    public  boolean isValid(Book book) {
        if (book.getBookName() == null || book.getBookName().isBlank()) {
            System.out.println("Книга не добавлена: отсутствует название.");
            return false;
        }
        if (book.getAuthor() == null || book.getAuthor().isBlank()) {
            System.out.println("Книга не добавлена: отсутствует автор.");
            return false;
        }
        if (book.getYear() <= 1800) {
            System.out.println("Книга не добавлена: неверный год издания.");
            return false;
        }
        return true;
    }
}
