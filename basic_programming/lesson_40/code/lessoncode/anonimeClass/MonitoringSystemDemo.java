package anonimeClass;

public class MonitoringSystemDemo {

    public static void main(String[] args) {

        MonitorSystem module1 = new MonitorSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Module 1");
            }
        };


        MonitorSystem module2 = new MonitorSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Module 2");
            }
        };

        MonitorSystem module3 = new MonitorSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Module 3");
            }
        };

        module1.startMonitoring();
        module2.startMonitoring();
        module3.startMonitoring();


    }
}
