package staticExample;

public class FinalExample {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("iPhone");

        System.out.println(phone);

        phone.model = "iPhone 15";
        System.out.println(phone);

    }
}
