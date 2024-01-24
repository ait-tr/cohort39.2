package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonsDemo {
    public static void main(String[] args) {

        Person person = new Person(1, "Kill Bill");
        Map<Long, Person> map = new HashMap<>();
        map.put(1L,person);

        //===================================================

        PersonRepository personRepository = new PersonRepository(map);

        Optional<Person> myPersonOptional = personRepository.findById(1L);

        if (myPersonOptional.isPresent()) {

            Person myPerson = myPersonOptional.get();

            String personName = myPerson.getName();

            System.out.println(personName);
        }

        Optional<Person> myPerson2Optional = personRepository.findById(2L);

        if (myPerson2Optional.isPresent()) {
            String personName2 = myPerson2Optional.get().getName();

            System.out.println(personName2);
        }



    }
}
