package lessoncode2.entity;

public class Printer {

    private int id;
    private String model;

    public Printer(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
