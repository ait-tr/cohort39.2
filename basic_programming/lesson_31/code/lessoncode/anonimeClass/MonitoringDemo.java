package anonimeClass;

public class MonitoringDemo {
    public static void main(String[] args) {
        MonitoringSystem generalModule = new GeneralIndicatorsMonitoringModule();
        MonitoringSystem errorModule = new ErrorMonitoringModule();
        MonitoringSystem securityModule = new SecurityMonitoringModule();

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
