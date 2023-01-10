import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Home5 {

    public static void main(String[] args) {

        String[][] twoDimArray = new String[8][8];

//        Первый способ решения:

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if((i + j) % 2 == 0) {
                    twoDimArray[i][j] = "W";
                } else {
                    twoDimArray[i][j] = "B";
                }
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

//     Второй способ решения:

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1) ? "W" : "B";
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }


    }

}
