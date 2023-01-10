package Lesson5;


//   3. Умножение двух матриц
//      Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
//      Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//      Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//      Ожидаемый результат: 1 2 3 1 1 1 0 0 0

public class Task_3 {

    public static void main(String[] args) {

        int[][] Matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] Matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] resultMatrix = new int[Matrix1.length][Matrix2[0].length];
        int counter1 = 0;
        int counter2 = 0;

        System.out.println("Даны две матрицы: ");
        for (int[] matrix : Matrix1) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] matrix : Matrix2) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        while (counter2 < resultMatrix[counter1].length) {
            while (counter1 < resultMatrix.length) {
                for (int i = 0; i < Matrix1[0].length; i++) {
                    resultMatrix[counter1][counter2] = resultMatrix[counter1][counter2]
                            + Matrix1[counter1][i] * Matrix2[i][counter2];
                }
                counter1++;
            }
            counter2++;
            counter1 = 0;
        }

        System.out.println("Результат перемножения матрицы Matrix1 на Matrix2 :");
        for (int[] matrix : resultMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }



    }
}
