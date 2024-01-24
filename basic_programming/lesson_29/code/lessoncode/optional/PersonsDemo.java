package optional;

import java.util.HashMap;
import java.util.Map;

public class PersonsDemo {
    public static void main(String[] args) {

        Person person = new Person(1, "Kill Bill");
        Map<Long, Person> map = new HashMap<>();
        map.put(1L,person);

        //===================================================

        PersonRepository personRepository = new PersonRepository(map);

        Person myPerson = personRepository.findById(1L);
        String personName = myPerson.getName();


        System.out.println(personName);

        Person myPerson2 = personRepository.findById(2L);

        String personName2 = myPerson2.getName();


        System.out.println(personName2);


    }
}
