package OOPExample.entity;

import OOPExample.interfaces.GearShift;

public class Car extends MotorizedVehicle{
    public Car(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }
}
