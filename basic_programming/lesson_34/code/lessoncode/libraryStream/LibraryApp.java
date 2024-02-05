package libraryStream;

import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUtil util = new LibraryUtil();

        util.printBooks(util.doWithLambda(library.getBooks()));

        System.out.println("=============");

        util.printBooks(library.getBooks());
    }
}
