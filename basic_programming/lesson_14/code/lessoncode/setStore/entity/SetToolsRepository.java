package setStore.entity;

import java.util.Arrays;

public class SetToolsRepository {

    SetTool[] setToolsRepo = new SetTool[3];

    public SetToolsRepository(SetTool setTools1, SetTool setTools2, SetTool setTools3) {
        setToolsRepo[0] = setTools1;
        setToolsRepo[1] = setTools2;
        setToolsRepo[2] = setTools3;
    }

    public SetTool[] getSetTools() {
        return setToolsRepo;
    }

    public void setSetTools(SetTool[] setTools) {
        this.setToolsRepo = setTools;
    }

    @Override
    public String toString() {
        return "SetToolsRepository{" +
                "setTools=" + Arrays.toString(setToolsRepo) +
                '}';
    }
}
