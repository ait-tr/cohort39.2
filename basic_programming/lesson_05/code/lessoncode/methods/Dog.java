package methods;

public class Dog {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void hello(){
        System.out.println("Hello!");
    }

    @Override
    public String toString() {
        return "methods.Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
