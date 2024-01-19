package practice.libraryVar2;

import java.util.*;

public class AuthorRepository {
    private Set<String> authors = new HashSet<>();
    public void addAuthor(String author) {
        authors.add(author);
    }

    public Set<String> getAuthors(){
        return authors;
    }

    public void removeAuthorIfNotFoundBooks(String author, BookRepository bookRepository){
        Iterator<String> iterator = authors.iterator();

        while (iterator.hasNext()){
            String currentAuthor = iterator.next();
            if (currentAuthor.equals(author)) {
                boolean hasBook = false;
                for (Book book : bookRepository.getBooks()){
                    if (book.getAuthor().equals(author)){
                        hasBook = true;
                        break;
                    }
                }
                if (!hasBook) {
                    iterator.remove();
                }
            }
        }
    }

}
