package arrayExamples;

import java.util.Arrays;

public class ArrayExample7 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ( (i + j) % 2 == 0) {
                    chessBoard[i][j] = " W ";
                } else {
                    chessBoard[i][j] = " B ";
                }
            }
        }

       // System.out.println(Arrays.deepToString(chessBoard));


        System.out.println("    1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");

        for (int i = 0; i < chessBoard.length; i++) {
            System.out.print((i + 1) + " |" );
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + "|");
            }
            System.out.println();
        }

    }
}
