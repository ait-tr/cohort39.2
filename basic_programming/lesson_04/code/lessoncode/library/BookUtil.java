package library;

public class BookUtil {

    public void editBookCatalogNumber(String catalogNumber, Book book){
        book.catalogNumber = catalogNumber;
    }

    public void editBookPageNumber(int pages, Book book){
        book.pages = pages;
    }

    public void editBookIsInStorage(boolean isInStorage, Book book){
        book.isInStorage = isInStorage;
    }

    public Book copyBook(Book book){
        Book copyBook = new Book(book.author, book.name + " (copy)", book.pages, book.catalogNumber, book.isInStorage);
        return copyBook;
    }


}
