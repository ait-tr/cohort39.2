package tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskStream1 {
    /*
    из коллекции футбольных команд отобрать:
     - самую сильную
     - команды из Essen

     */

    public static void main(String[] args) {
        List<FootBallTeam> list_1 = Arrays.asList(
                new FootBallTeam("Dusseldorf", 7),
                new FootBallTeam("Essen", 4),
                new FootBallTeam("Cologne", 6),
                new FootBallTeam("Dortmund", 5),
                new FootBallTeam("Wuppertal", 3),
                new FootBallTeam("Duisburg", 5),
                new FootBallTeam("Bonn", 6),
                new FootBallTeam("Essen 3", 3),
                new FootBallTeam("Essen 2", 3)
        );

        Comparator<FootBallTeam> powerComparator = new Comparator<FootBallTeam>() {
            @Override
            public int compare(FootBallTeam o1, FootBallTeam o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        };

        FootBallTeam maxPowerTeam = list_1.stream()
                .max(powerComparator)
                .get();

        System.out.println(maxPowerTeam);



        List<FootBallTeam> essenTeams = list_1.stream()
                .filter(team -> team.getName().contains("Essen"))
                .toList();

        System.out.println(essenTeams);


    }
}
