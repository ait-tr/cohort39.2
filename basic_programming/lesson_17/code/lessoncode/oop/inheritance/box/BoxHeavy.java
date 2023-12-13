package oop.inheritance.box;

public class BoxHeavy extends Box{

    private double weight;

    public BoxHeavy(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
