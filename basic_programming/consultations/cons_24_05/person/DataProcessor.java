package person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    public static void main(String[] args) throws IOException {
        String filePath = "basic_programming/consultations/cons_24_05/data.txt";
        List<PersonItem> personItems = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;

        while ((line = reader.readLine()) != null) {
            if (line.trim().startsWith("{")) {
                String name = reader.readLine();
                name = name.trim();
                name = name.split(": ")[1];
                name = name.replaceAll(",","");
                name = name.trim();

                String ageString = reader.readLine();
                ageString = ageString.trim();
                ageString = ageString.split(": ")[1];
                ageString = ageString.replaceAll(",","");
                ageString = ageString.trim();
                int age = Integer.parseInt(ageString);

                PersonItem item = new PersonItem(name,age);
                personItems.add(item);

                reader.readLine(); // пропустить строку с закрывающейся скобкой

            }
        }

        reader.close();

        System.out.println(personItems);

        // Проверить наличие элемента с совпадением по условию

        String searchValue = "John";
        boolean isContains = false;
        PersonItem findedItem = null;

        for (PersonItem item : personItems) {
            if (item.getName().equals(searchValue)) {
                findedItem = item;
                isContains = true;
            }
        }

        if (isContains) {
            System.out.println("Find element: " + findedItem);
        } else {
            System.out.println("Not found!");
        }

    }
}
