package students;

import java.util.Arrays;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Address address1 = new Address(1010, "Riga","Brivibas iela", 47 );
        Person person1 = new Person(1,"Ruslan", address1, new Date(80,11,1 ));
        Student student1 = new Student(1, person1,"group 39.2", 4.5,true);
        //System.out.println(student1);

        Address[] addresses = new Address[3];
        Person[] persons = new Person[3];
        Student[] students = new Student[3];

        for (int i = 0; i < addresses.length; i++) {
            addresses[i] = new Address(i, "Berlin", " Address # " + i , i + 10);
        }

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(i*10, "Name " + i, addresses[i], new Date());

        }

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i,persons[i],"39.2",Math.random()*5, true);
            System.out.println(students[i]);
        }


    }
}
