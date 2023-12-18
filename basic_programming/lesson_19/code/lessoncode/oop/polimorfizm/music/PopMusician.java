package oop.polimorfizm.music;

public class PopMusician implements Musician{

    @Override
    public void dance() {
        System.out.println("pop dancing");
    }

    @Override
    public void sing() {
        System.out.println("pop singing");
    }

    @Override
    public void greeting() {
        System.out.println("pop greating");
    }
}
