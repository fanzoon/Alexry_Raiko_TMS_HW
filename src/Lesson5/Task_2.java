package Lesson5;


//   2. Шахматная доска
//      Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8.
//      С помощью циклов задать элементам циклам значения B(Black) или W(White).

public class Task_2 {
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
