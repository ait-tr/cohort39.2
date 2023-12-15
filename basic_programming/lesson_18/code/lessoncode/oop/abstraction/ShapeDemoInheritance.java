package oop.abstraction;

public class ShapeDemoInheritance {
    public static void main(String[] args) {
        Shape circle1 = new Circle("Circle1", 5);
        Shape circle2 = new Circle("Circle2", 9);
        Shape circle3 = new Circle("Circle3", 15);

        Shape square1 = new Square("Square1", 3);
        Shape square2 = new Square("Square2", 10);
        Shape square3 = new Square("Square3", 20);

        Shape rectangle1 = new Rectangle("Rectangle1", 3,4);
        Shape rectangle2 = new Rectangle("Rectangle2", 10,12);
        Shape rectangle3 = new Rectangle("Rectangle3", 20,25);

        Shape[] shapes = {circle1,circle2,circle3,square1,square2,square3,rectangle1,rectangle2,rectangle3};

        // Посчитать суммарную площадь всех фигур

        double allAreas = 0;

        for (int i = 0; i < shapes.length; i++) {
            allAreas = allAreas + shapes[i].calculatorArea();
        }


        System.out.println("Сумма площадей всех фигур = " + allAreas);


    }
}
