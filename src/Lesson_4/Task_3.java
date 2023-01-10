package Lesson_4;

import java.util.Arrays;

//     Task 3:
//     3.0  Создайте 2 массива из 5 чисел.
//     3.1  Выведите массивы на консоль в двух отдельных строках.
//     3.2   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//           для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

public class Task_3 {

    public static void main(String[] args) {


        int[] array1 = {3, 6, 22, 13, 17};
        int[] array2 = {8, 36, 2, 19, 7};
        int sumOfElementsArray1 = 0;
        int sumOfElementsArray2 = 0;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            sumOfElementsArray1 += array1[i];
            sumOfElementsArray2 += array2[i];
        }

        int averageOfArray1 = sumOfElementsArray1 / array1.length;
        int averageOfArray2 = sumOfElementsArray2 / array2.length;

        if (averageOfArray1 > averageOfArray2) {
            System.out.println("Среднее арифметическое значение элементов массива array1 > array2: " + "\n"
                    + averageOfArray1 + ">" + averageOfArray2);
        } if (averageOfArray2 > averageOfArray1) {
            System.out.println("Среднее арифметическое значение элементов массива array2 > array1: " + "\n"
                    + averageOfArray2 + ">" + averageOfArray1);
        } else { System.out.println("Среднее арифметическое значение элементов массива array2 и array1 равны : " + "\n"
                + averageOfArray2 + "=" + averageOfArray1);
        }
    }
}





