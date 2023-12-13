package phone2version.phone;

import java.util.Arrays;

public class Phone {
    private int imei;

    private SimCard[] simCards = new SimCard[2];

    private String model;

    private PhoneCase phoneCase;

    public Phone(int imei,  String model) {
        this.imei = imei;
        this.model = model;
    }


    public void setOneSimCard(SimCard simCard, int numberOfCell){
        simCards[numberOfCell] = simCard;
    }

    public void setSimCard(SimCard[] simCards) {

        this.simCards = simCards;
    }

    public int getImei() {
        return imei;
    }

    public SimCard[] getSimCard() {
        return simCards;
    }

    public String getModel() {
        return model;
    }

    public PhoneCase getPhoneCase() {
        return phoneCase;
    }

    public void setPhoneCase(PhoneCase phoneCase) {
        this.phoneCase = phoneCase;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + Arrays.toString(simCards) +
                ", model='" + model + '\'' +
                '}';
    }
}
