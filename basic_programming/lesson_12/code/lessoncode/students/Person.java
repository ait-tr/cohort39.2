package students;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private Address address;
    private Date birthDay;

    public Person(int id, String name, Address address, Date birthDay) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", birthDay=" + birthDay +
                '}';
    }
}
