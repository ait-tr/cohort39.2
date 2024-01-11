package libraryApp.service.searchUtil;


import libraryApp.entity.Book;

interface BookMatcher {
    boolean match(Book book);
}
