package staticExample;

public class PersonDemo {
    public static void main(String[] args) {
        Person personOlga = new Person("Olga");
        personOlga.town = "Berlin";


        System.out.println("====== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        Person personPetr = new Person("Petr");
        personPetr.town = "Leipzig";

        System.out.println("====== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


        System.out.println("  еще раз про Ольгу:");
        System.out.println("====== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        Person.town = "London";

        System.out.println("====== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("====== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);
    }
}
