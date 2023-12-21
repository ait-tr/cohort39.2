package bookCase.service.find;

import bookCase.entiry.Book;

public class FindByBookName implements FindBy{
    @Override
    public boolean find(Book book, String searchCriteria) {
        return book.getBookName().equals(searchCriteria);
    }
}
