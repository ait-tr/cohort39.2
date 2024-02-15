package bookCase.service;

import bookCase.entiry.Book;
import bookCase.entiry.Bookcase;
import bookCase.entiry.Bookshelf;
import bookCase.service.find.FindBy;
import bookCase.service.find.FindByAuthor;
import bookCase.service.find.FindByBookName;

public class FindBook {

    FindByBookName findByBookName = new FindByBookName();
    FindByAuthor findByAuthor = new FindByAuthor();

    public Book findByName(String bookName, Bookcase bookcase){
        return findBy(bookName, bookcase, findByBookName);
    }

    public Book findByAuthor(String authorName, Bookcase bookcase){
        return findBy(authorName, bookcase, findByAuthor);
    }

    //----------- далее пишем метод, который будет осуществлять поиск книги по  книжному шкафу
    // ---- НО у него есть аргумент findBySearchCriteria - в котором будет передана и хранится ссылка на
    // экземпляр класса, который имлементирует интерфейс FindBy у которое задекларирован метод find
    // а вот КАК ИМЕННО надо осуществлять поиск и по каким параметрам сравнивать это уже прописано в самом классе
    // ссылка на который передается

//    private entity.Book findBy(String searchCriteria, Bookcase bookcase, FindBy findBySearchCriteria) {
//        Bookshelf[] bookshelves = bookcase.getBookShelves();
//        for (int i = 0; i < bookshelves.length; i++) {
//            entity.Book[] books = bookshelves[i].getBooksOnShelf();
//            for (int j = 0; j < books.length; j++) {
//                if (findBySearchCriteria.find(books[j], searchCriteria)) {
//                    return books[j];
//                }
//            }
//        }
//        return null;
//    }


    private Book findBy(String searchCriteria, Bookcase bookcase, FindBy findBySearchCriteria) {

        for (Bookshelf shelf : bookcase.getBookShelves()) {
            for (Book book : shelf.getBooksOnShelf()) {
                if (findBySearchCriteria.find(book, searchCriteria)) {
                    return book;
                }
            }
        }
        return null;
    }

    public Book findByPlace(int shelfNumber, int indexOnShelf, Bookcase bookcase) {
        Bookshelf[] bookshelves = bookcase.getBookShelves();
        Book[] books = bookshelves[shelfNumber - 1].getBooksOnShelf();
        return books[indexOnShelf];
    }
}
