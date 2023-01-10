package Lesson_4;

import java.util.Random;
import java.util.Scanner;

//     Task 1:
//     1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//        Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//        В результате должен быть новый массив без указанного числа.


public class Task_1_1 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[random.nextInt(5, 10)];
        int number;
        int search = 0;
        int[] array1;

        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        while (true) {
            System.out.println("\nВведите число, которое хотите удалить: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            number = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    search++;
                }
            }
            if (search == 0) {
                System.out.println("Такого числа в массиве нет");
            } else {
                break;
            }
        }
        array1 = new int[array.length - search];
        System.out.println("Массив: ");
        for (int i = 0, a = 0; i < array.length; i++, a++) {
            if (array[i] == number) {
                a--;
                continue;
            }
            System.arraycopy(array, i, array1, a, 1);
        }
        for (int value : array1) {
            System.out.print(value + " ");
        }

    }

}
