package anonimeClass;

public class MonitoringDemoWithAnonymousClass {
    public static void main(String[] args) {
         MonitoringSystem generalModule = new MonitoringSystem() {

             private String code;
             @Override
             public void startMonitoring() {
                 System.out.println("General monitoring started");
                 code = "Text" ;
                 someSpecificMethod();
             }

             private void someSpecificMethod(){
                 System.out.println("Specific method");
             }
         };

        MonitoringSystem errorModule =new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Error monitoring started");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
             @Override
             public void startMonitoring() {
                 System.out.println("Security monitoring started");
                    }
                };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
