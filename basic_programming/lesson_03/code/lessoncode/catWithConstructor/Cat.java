package catWithConstructor;

public class Cat {
    String name;
    int age;
    String breed;


    public Cat(String name) {
        this.name = name;
    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
