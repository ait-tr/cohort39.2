package homework6;

public class Task3Util {
    public String fromSecToText(int seconds){

        int hours = seconds / 3600;

        String secToText = "до конца работы " + hours + " часов";

        if (hours < 5) {secToText = "до конца работы " + hours + " часа";}
        if (hours == 1) {secToText = "до конца работы " + hours + " час";}
        if (hours < 1) {secToText = "до конца работы менее часа";}

        return secToText;
    }
}
