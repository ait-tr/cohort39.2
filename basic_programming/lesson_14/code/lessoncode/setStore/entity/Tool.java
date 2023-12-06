package setStore.entity;

public class Tool {
    private int id;
    private String toolName;
    private String toolDescription;
    private double price;

    public Tool(int id, String toolName, String toolDescription, double price) {
        this.id = id;
        this.toolName = toolName;
        this.toolDescription = toolDescription;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getToolName() {
        return toolName;
    }

    public String getToolDescription() {
        return toolDescription;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", toolName='" + toolName + '\'' +
                ", toolDescription='" + toolDescription + '\'' +
                ", price=" + price +
                '}';
    }

}
