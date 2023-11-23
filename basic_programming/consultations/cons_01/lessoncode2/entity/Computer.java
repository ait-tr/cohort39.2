package lessoncode2.entity;

public class Computer {

    private int id;
    private String model;

    private String processor;

    public Computer(int id, String model, String processor) {
        this.id = id;
        this.model = model;
        this.processor = processor;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
