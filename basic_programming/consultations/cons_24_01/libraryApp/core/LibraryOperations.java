package libraryApp.core;

import libraryApp.entity.Author;
import libraryApp.entity.Book;
import libraryApp.service.InputOutput.InputData;
import libraryApp.service.LibraryServices;
import libraryApp.service.InputOutput.OutputData;

import java.util.List;

public class LibraryOperations {

    /*
     1)
    - получить от пользователя или другого источника данные о размере нашей коллекции
    - создание коллекции
    - наполнение коллекции:
     - получение данных для создания элементов коллекции
     - проверка корректности данных (валидация) - ?

     2) добавление элементов коллекции
     - начало
     - конец

     3) поиск элемента по условию
     - удаление этого элемента
     */
        LibraryServices services = new LibraryServices();
        InputData inputData = new InputData();
        OutputData outputData = new OutputData();

        public void run(){
            int sizeOfOurLibrary = inputData.inputNumberOfElements();
            List<Book> ourLibrary = services.createLibrary();
            services.fillLibrary(ourLibrary,sizeOfOurLibrary, inputData, false);
            //outputData.printOurLibrary("Our library ", ourLibrary);

            services.fillLibrary(ourLibrary,1,inputData, false);
            services.fillLibrary(ourLibrary,5,inputData, true);

            outputData.printOurLibrary("Our library after additional new books", ourLibrary);


//            String searchBookCriteria = "";//inputData.inputSearchCriteria();
//            List<entity.Book> foundedBooks = services.searchBookByBookName(ourLibrary,searchBookCriteria);
//            outputData.printOurLibrary("Книги удовлетворяющие условию поиска: ",foundedBooks);
//            services.deleteBook(ourLibrary,foundedBooks);
//            outputData.printOurLibrary("Our library after delete books", ourLibrary);


            /*
            для ДЗ

            1) внести изменения в код , чтобы создание новой книги для добавления в начало коллекции или хвост осуществлялось автоматически

             */


        }



}
