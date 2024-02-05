package studetnAndBook;

public class Example5 {
    /*
Студент записывает книги которые прочитал,
задача вывести все прочитанные книги у всех студентов
(в качестве дополнения, применить фильтр на любую тему)
 */

    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.addBook("Java 8 vs Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student1.addBook("HTML introducing");
        student1.addBook("Effective Java");




    }
}
