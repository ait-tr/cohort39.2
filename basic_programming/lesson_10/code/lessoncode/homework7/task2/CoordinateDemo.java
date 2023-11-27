package homework7.task2;

import java.util.Random;

public class CoordinateDemo {
    public static void main(String[] args) {
        CoordinateQuadrantDetect detect = new CoordinateQuadrantDetect();

        int x = 5;
        int y = -5;

        int quadtant = detect.detect(x,y);

        if (quadtant == 0){
            System.out.println("Точка с координатами x = " + x + " и y = " + y + " находится на оси или в центре");
        } else {
            System.out.println("Точка с координатами x = " + x + " и y = " + y + " находится в " + quadtant + " квадрате");

        }
    }
}
