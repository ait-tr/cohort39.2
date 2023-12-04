package carTruck;

public class TruckDemo {
    public static void main(String[] args) {

        Engine engineForOurTruck = new Engine("V6500", 12000, true);
        Truck myTruck = new Truck(engineForOurTruck, 10);

        Engine engineForOurTruckNewModel = new Engine("V8000", 16000, true);
        myTruck.engine = engineForOurTruckNewModel;
    }
}
