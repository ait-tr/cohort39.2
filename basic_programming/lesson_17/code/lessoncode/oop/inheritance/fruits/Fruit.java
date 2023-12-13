package oop.inheritance.fruits;

import java.util.Arrays;

public class Fruit {
    private String[] vitamins;

    private int sugar;

    public Fruit(String[] vitamins, int sugar) {
        System.out.println("Super class constructor");
        this.vitamins = vitamins;
        this.sugar = sugar;
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "vitamins=" + Arrays.toString(vitamins) +
                ", sugar=" + sugar +
                '}';
    }
}
