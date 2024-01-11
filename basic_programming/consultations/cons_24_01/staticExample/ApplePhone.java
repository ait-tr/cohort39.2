package staticExample;

public class ApplePhone {

    public final String PRODUCER = "APPLE";
    public String model;

    public ApplePhone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ApplePhone{" +
                "PRODUCER='" + PRODUCER + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
