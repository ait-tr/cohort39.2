package bookCase.service.find;

import bookCase.entiry.Book;

public interface FindBy {

    public boolean find(Book book,String searchCriteria);
}
