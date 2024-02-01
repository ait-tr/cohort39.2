package entity;

public class Client {
    private int id;
    private String name;
    private  String description;

    public Client(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Client(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
