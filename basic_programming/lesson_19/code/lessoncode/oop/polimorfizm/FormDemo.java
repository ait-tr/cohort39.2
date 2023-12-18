package oop.polimorfizm;

public class FormDemo {
    public static void main(String[] args) {
        Form form = new Form();

        form.area(5);
        System.out.println("Площадь круга: " + form.getAreaForm());

        form.area(2.5);
        System.out.println("Площадь квадрата: " + form.getAreaForm());

        form.area(3.0,2);
        System.out.println("Площадь прямоугольника: " + form.getAreaForm());

    }
}
