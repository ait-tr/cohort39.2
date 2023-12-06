package setStore.entity;

import java.util.Arrays;

public class SetToolsRepository {

    SetTool[] setTools = new SetTool[3];

    public SetToolsRepository(SetTool setTools1, SetTool setTools2, SetTool setTools3) {
        setTools[0] = setTools1;
        setTools[1] = setTools2;
        setTools[2] = setTools3;
    }

    public SetTool[] getSetTools() {
        return setTools;
    }

    public void setSetTools(SetTool[] setTools) {
        this.setTools = setTools;
    }

    @Override
    public String toString() {
        return "SetToolsRepository{" +
                "setTools=" + Arrays.toString(setTools) +
                '}';
    }
}
