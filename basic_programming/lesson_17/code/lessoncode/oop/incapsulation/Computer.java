package oop.incapsulation;

public class Computer {

    private int id;

    private String model;

    public Computer(int id) {
        this.id = id;
    }

    private String getComputerModelFromDatabase(){
        // обратиться к базе данных
        // отправить запрос по id
        // получить данные о модели компьютера из каталога по id
        return "super computer";
    }

    public void printComputerInfo(){
        model = getComputerModelFromDatabase();
        System.out.println("ID: " + id + " model: " + model);
    }
}
