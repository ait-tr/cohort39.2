package oop.incapsulation.twoLevel;

public class Person {

    private int id;
    private String firstName;
    private String secondName;
    private String town;

    private String address;

    public Person(int id, String firstName, String secondName, String town) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.town = town;
    }


    private String receiveAddressFromDatabase(int id){
        //...
        return "";
    }


    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
