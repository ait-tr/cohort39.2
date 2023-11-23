package lessoncode2.entity;

public class Phone {
    private int id;
    private String model;
    private double price;

    public Phone(int id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
