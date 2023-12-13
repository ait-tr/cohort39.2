package oop.inheritance.multiLevel;

public class MultiLevelExample {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("Класс B является наследником от А и поэтому имеет методы:");
        b.printA();
        b.printB();

        System.out.println("========");

        C c = new C();
        System.out.println("Класс С является наследником от А и поэтому имеет методы:");
        c.printA();
        c.printC();
        System.out.println("========");

        D d = new D();
        System.out.println("Класс С является наследником от B и поэтому имеет методы:");

        d.printA();
        d.printB();
        d.printD();
    }
}

/*
    A  -> B  -> D
    A  -> C
 */
