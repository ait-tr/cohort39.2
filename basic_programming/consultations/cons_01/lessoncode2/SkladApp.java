package lessoncode2;

import lessoncode2.entity.Computer;
import lessoncode2.entity.Phone;
import lessoncode2.entity.Printer;
import lessoncode2.userInput.InputData;
import lessoncode2.userInput.UserInput;

import java.util.Arrays;

public class SkladApp {
    public static void main(String[] args) {

        /*
    нужно запросить у пользователя количество каждого товара (или получить рандомно)

         */

        UserInput ui = new UserInput();
        int phonesQ = ui.userInterfaceInputInt("Пожалуйста введите количество телефонов на складе");
        int computersQ = ui.userInterfaceInputInt("Пожалуйста введите количество компьютеров на складе");
        int printersQ = ui.userInterfaceInputInt("Пожалуйста введите количество принтеров на складе");


        Phone[] phones = new Phone[phonesQ];
        Computer[] computers = new Computer[computersQ];
        Printer[] printers = new Printer[printersQ];

        InputData inputData = new InputData();
        inputData.inputPhonesData(phones);
        inputData.inputComputerData(computers);
        inputData.inputPrinterData(printers);

        System.out.println(Arrays.toString(phones));

        System.out.println(Arrays.toString(computers));

        System.out.println(Arrays.toString(printers));

    }
}
