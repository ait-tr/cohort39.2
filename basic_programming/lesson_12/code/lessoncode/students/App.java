package students;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Address address1 = new Address(1010, "Riga","Brivibas iela", 47 );
        Person person1 = new Person(1,"Ruslan", address1, new Date(80,11,1 ));
        Student student1 = new Student(1, person1,"group 39.2", 4.5,true);

        System.out.println(student1);
    }
}
