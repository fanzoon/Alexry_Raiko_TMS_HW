package Lesson4_task;

import java.util.Arrays;

public class Home43 {

    public static void main(String[] args) {

        int[] array1 = new int[] {3, 12, 7, 1, 14};
        int[] array2 = {11, 4, 6, 15, 2};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int summa1 = 0;
        int summa2 = 0;

        for (int i = 0; i < array1.length; i++) {
            summa1 = summa1 + array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            summa1 = summa1 + array1[j];
        }
        if ( summa1 / array1.length > summa2 / array2.length) {
            System.out.println("Среднее арифметическое значение  массива array1 больше чем у array2");
        } else if ( summa1 / array1.length < summa2 / array2.length) {
            System.out.println("Среднее арифметическое значение  массива array2 больше чем у array2");
        } else {
            System.out.println("Средние арифметические значения массива array2 и array2 равны ");
        }
    }

}
