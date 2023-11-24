package homework6;

import java.util.Random;

public class BankService {

    public int getBalance(){
        Random random = new Random();
        return random.nextInt(1000);
    }

    public int getDraw(int balance){
        for (int i = balance / 2; i > 0; i--) {
            if (balance % i == 0) {
                return i;}
        }
        return 1;
    }
}
