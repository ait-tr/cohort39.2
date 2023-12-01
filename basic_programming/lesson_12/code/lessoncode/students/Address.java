package students;

public class Address {
    private int index;
    private String town;
    private String street;
    private int house;

    public Address(int index, String town, String street, int house) {
        this.index = index;
        this.town = town;
        this.street = street;
        this.house = house;
    }

    public int getIndex() {
        return index;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index=" + index +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
