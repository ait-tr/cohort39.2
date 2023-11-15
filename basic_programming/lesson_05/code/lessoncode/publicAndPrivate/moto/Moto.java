package publicAndPrivate.moto;

public class Moto {

    private String color;
    private String model;
    private String producer;

    public Moto(String color, String model, String producer) {
        this.color = color;
        this.model = model;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
