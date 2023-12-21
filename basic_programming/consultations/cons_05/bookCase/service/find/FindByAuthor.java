package bookCase.service.find;

import bookCase.entiry.Book;

public class FindByAuthor implements FindBy{
    @Override
    public boolean find(Book book, String searchCriteria) {
        return book.getBookAuthor().equals(searchCriteria);
    }
}
