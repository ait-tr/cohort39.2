package enumExample;

public class EnumDemo {
    public static void main(String[] args) {

        String OPEN = "OPEN";
        String CLOSE = "CLOSE";
        String HOLD = "HOLD";

        String myProjectStatus = OPEN;

        Status statusType = Status.HOLD;

      //  System.out.println(statusType);

        switch (statusType){
            case OPEN -> System.out.println("Проект открыт и в стадии разработки");
            case HOLD -> System.out.println("Проект заморожен");
            case CLOSE -> System.out.println("Проект завершен");
        }

//        switch (myProjectStatus){
//            case "OPEN" -> System.out.println("Проект открыт и в стадии разработки");
//            case "HOLD" -> System.out.println("Проект заморожен");
//            case "CLOSE" -> System.out.println("Проект завершен");
//        }

        Status[] statuses = Status.values();

        for (Status status : statuses)
        {
            System.out.println(status);
        }

        Status status = Status.valueOf(OPEN);
        System.out.println("Статус проекта: "  + status);
    }
}
