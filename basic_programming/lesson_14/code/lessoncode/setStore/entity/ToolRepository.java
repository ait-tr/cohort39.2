package setStore.entity;

import java.util.Arrays;

public class ToolRepository {

    private Tool[] tools ;

    public ToolRepository() {
        tools = new Tool[6];
        tools[0] = new Tool(1, "Hammer",  "Hammer (model1)", 25);
        tools[1] = new Tool(2, "Nails",  "Nails (20x2 mm)", 5);
        tools[2] = new Tool(3, "Drill",  "Drill WATT (acc)", 52);
        tools[3] = new Tool(4, "Pliers",  "Pliers (super still)", 47);
        tools[4] = new Tool(5, "Screwdriver",  "WATT (with bit)", 15);
        tools[5] = new Tool(6, "Screws",  "Screws (15x5 mm)", 7);
        //System.out.println(Arrays.toString(tools));
    }

    public Tool[] getTools() {
        return tools;
    }


    @Override
    public String toString() {
        return "ToolRepository{" +
                "tools=" + Arrays.toString(tools) +
                '}';
    }
}
