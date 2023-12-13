package oop.inheritance.dog;

public class SmallDog extends Dog{
    private String name;

    public SmallDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(" Small dog voiiiiiiiiiiice!");
    }

    public void eat(){
        System.out.println("small dog eating small");
    }
}
