package OOPExample.entity;

import OOPExample.interfaces.GearShift;

public class MotoBike extends MotorizedVehicle{
    public MotoBike(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }
}
