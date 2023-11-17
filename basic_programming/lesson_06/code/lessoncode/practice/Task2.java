package practice;

public class Task2 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        NumbersUtil util = new NumbersUtil();


        System.out.println("Please enter first number: ");
        int x = ui.userInputInt();
        System.out.println("Please enter second number: ");
        int y = ui.userInputInt();
        System.out.println("Please enter third number: ");
        int z = ui.userInputInt();

        System.out.println("Original numbers: " + x + " ," + y + ", " + z);
        System.out.println("Сортировка по возрастанию: ");
        util.printSortedNumbers(x,y,z, true);
        System.out.println("Сортировка по убыванию: ");
        util.printSortedNumbers(x,y,z,false);

    }
}
