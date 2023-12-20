package association;

public class Car {
    private String carName;
    private Driver driver;

    public Car(String carName, Driver driver) {
        this.carName = carName;
        this.driver = driver;
    }

    public void printDetails(){
        System.out.println(carName + " управляется " + driver.getDriverName());
    }
}
