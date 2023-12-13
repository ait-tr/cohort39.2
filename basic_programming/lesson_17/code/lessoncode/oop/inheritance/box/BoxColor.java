package oop.inheritance.box;

public class BoxColor extends Box{

    private String color;

    public BoxColor(double width, double height, double depth, String color) {
        super(width, height, depth);
        this.color = color;
    }
}
