package setStore.entity;

import java.util.Arrays;

public class SetTool {

    Tool[] setTools = new Tool[2];

    public SetTool(Tool tool1, Tool tool2) {
        setTools[0] = tool1;
        setTools[1] = tool2;
    }

    public Tool[] getSetTools() {
        return setTools;
    }

    @Override
    public String toString() {
        return "SetTool{" +
                "setTools=" + Arrays.toString(setTools) +
                '}';
    }
}
