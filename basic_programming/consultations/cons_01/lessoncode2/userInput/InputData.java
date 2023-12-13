package lessoncode2.userInput;


import lessoncode2.entity.Computer;
import lessoncode2.entity.Phone;
import lessoncode2.entity.Printer;

public class InputData {

    UserInput ui = new UserInput();

    public void inputPhonesData(Phone[] phones){
        for (int i = 0; i < phones.length; i++) {
            System.out.println("Phone #" + (i+1));
            int id = ui.userInterfaceInputInt("Please enter phones 'id':");
            String model = ui.userInterfaceInputText("Please enter phones 'model':");
            double price = ui.userInterfaceInputDouble("Please enter phones 'price':");
            phones[i] = new Phone(id,model,price);
        }
    }

    public void inputComputerData(Computer[] computers){
        for (int i = 0; i < computers.length; i++) {
            System.out.println("oop.incapsulation.Computer #" + (i+1));
            int id = ui.userInterfaceInputInt("Please enter computer's 'id':");
            String model = ui.userInterfaceInputText("Please enter computer's 'model':");
            String processor = ui.userInterfaceInputText("Please enter computer's 'processor':");
            computers[i] = new Computer(id,model,processor);
        }
    }

    public void inputPrinterData(Printer[] printers){
        for (int i = 0; i < printers.length; i++) {
            System.out.println("Printer #" + (i+1));
            int id = ui.userInterfaceInputInt("Please enter printer's 'id':");
            String model = ui.userInterfaceInputText("Please enter printer's 'model':");
            printers[i] = new Printer(id,model);
        }
    }
}
