package catWithoutConstructor;

public class CatsDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Murzik";
        myCat.breed = "Brit";
        myCat.age = 3;

        myCat.meow();
        System.out.println("Возраст нашей кошки - " + myCat.age);
        myCat.happyBirthDay();
        System.out.println("Возраст нашей кошки - " + myCat.age);
    }
}
