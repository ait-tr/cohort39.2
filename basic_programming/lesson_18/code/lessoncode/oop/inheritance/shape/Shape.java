package oop.inheritance.shape;

public class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    // должен бы быть метод для расчета площади геометрической фигуры и периметра


    public String getTitle() {
        return title;
    }

    public double calculatorArea(){
        return 0;
    }

    public double calculatorPerimeter(){
        return 0;
    }

}
