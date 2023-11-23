package lessoncode1;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone);
        System.out.println(phone.model);
        System.out.println(phone.price);
        System.out.println(phone.isSmartphone);

        phone.model = "iPhone";
        phone.price = 1200;
        phone.isSmartphone = true;

        System.out.println(phone.model);
        System.out.println(phone.price);
        System.out.println(phone.isSmartphone);

        Phone phone1 = new Phone("Samsung", 1400, true);

        System.out.println(phone1.model);
        System.out.println(phone1.price);
        System.out.println(phone1.isSmartphone);

    }
}
