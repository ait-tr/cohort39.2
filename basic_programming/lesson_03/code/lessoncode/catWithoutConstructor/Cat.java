package catWithoutConstructor;

public class Cat {
    String name;
    int age;
    String breed;

    public void meow(){
        System.out.println("Meow!");
        System.out.println("methods.Cat name: " + name);
        System.out.println("methods.Cat breed: " + breed);
    }

    public void happyBirthDay(){
        System.out.println("У нашей кошки сегодня день рождения!");
        System.out.println("Ей было " + age);
        age = age + 1;

        // аналогично такой команде age++;
        System.out.println("А теперь ей " + age);
    }

}
