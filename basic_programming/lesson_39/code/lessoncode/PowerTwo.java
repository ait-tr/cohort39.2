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


    public boolean isPowerOfTwoSecond(int number){
        if (number <= 0) {
            return false;
        }

        while (number > 1) {
            if (number % 2 != 0) {
                return false;
            }
            number /= 2;

        }

        return true;
    }

    public boolean isPowerOfTwoMath(int number){
        if (number <= 0) {
            return false;
        }

        boolean result = Math.ceil(Math.log(number) / Math.log(2)) == Math.floor(Math.log(number) / Math.log(2));

        return result;
    }

    public boolean isPowerOfTwoBinaryOperation(int number){
        if (number <= 0) {
            return false;
        }
        return (number & (number - 1)) == 0;
        /*
        4 -> 100
        3 -> 011

        8 -> 1000
        7 -> 0111


        5 -> 101
        4 -> 100
        --------
             100 - не равно 0!!

         */
    }


}
