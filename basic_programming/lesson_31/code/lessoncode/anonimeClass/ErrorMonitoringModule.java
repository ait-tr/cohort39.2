package anonimeClass;

public class ErrorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Error monitoring started");
    }
}
