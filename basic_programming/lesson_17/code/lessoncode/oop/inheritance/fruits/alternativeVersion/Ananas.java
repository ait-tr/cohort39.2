package oop.inheritance.fruits.alternativeVersion;

public class Ananas  {

    private Fruit fruit;
    private int cellulose;

    public Ananas(String[] vitamins, int sugar, int cellulose) {
        this.fruit = new Fruit(vitamins, sugar);
        this.cellulose = cellulose;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getCellulose() {
        return cellulose;
    }

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }

    @Override
    public String toString() {
        return "Ananas{" +
                "fruit=" + fruit +
                ", cellulose=" + cellulose +
                '}';
    }
}
