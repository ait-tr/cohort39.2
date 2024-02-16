public class PowerTwo {

    public boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }
        int powerOfTwo = 1;
        while (powerOfTwo < number) {
            powerOfTwo *= 2;
        }
        return powerOfTwo == number;
    }
}
