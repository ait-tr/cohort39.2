package oop.inheritance.fruits;

public class Ananas extends Fruit {
    private int cellulose;

    public Ananas(String[] vitamins, int sugar, int cellulose) {
        super(vitamins, sugar);
        this.cellulose = cellulose;
        System.out.println("Subclass constructor invoked!");
    }

    public int getCellulose() {
        return cellulose;
    }

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }

    @Override
    public String toString() {
        return "Ananas{" + super.toString() +
                "cellulose=" + cellulose +
                '}';
    }
}
