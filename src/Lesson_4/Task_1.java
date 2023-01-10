package Lesson_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//  1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//     Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//     В результате должен быть новый массив без указанного числа.

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int[] array = {2, 14, 33, 8, 1, 2, 13, 1, 20, 2, 6, 14};
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число");
        int n = scanner.nextInt();

        int count = 0;
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        int length = array.length - count;

        int[] array1 = new int[length];

        System.out.println("Количество совпадений введенного числа с элементами массива: " + count);

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != n) {
                array1[j] = array[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(array1));

//        System.out.println( Arrays.asList(2, 14, 33, 8, 1, 2, 13, 1, 20, 2, 6, 14)
//                .stream()
//                .map(x -> x * 1.0)
//                .filter(integer -> integer != n)
//                .collect(Collectors.toList()));

    }
}
