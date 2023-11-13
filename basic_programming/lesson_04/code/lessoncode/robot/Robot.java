package robot;

public class Robot {

    String mark;

    public Robot(String mark) {
        this.mark = mark;
    }

    public void hello(){
        System.out.println("Hello!");
        System.out.println("I am robot " + mark);
    }

    public double currencyConverter(double usdValue, double exchangeRateUSdToEuro){
        double euroValue = usdValue * exchangeRateUSdToEuro;
        return euroValue;
    }

}
