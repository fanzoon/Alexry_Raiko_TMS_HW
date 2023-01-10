package Lesson_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//   Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//   Для генерации случайного числа используйте метод Math.random().
//   Пусть будет возможность создавать массив произвольного размера.
//   Пусть размер массива вводится с консоли.


public class Task_2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int lengthArray;
        int[] array;
        int maxiValue;
        int minValue;
        int averageValue;
        int sumElements = 0;



        while (true) {
            System.out.println("Введите размер массива:");
            while (!scanner.hasNextInt()) {
                System.out.println("Для задания размера массива используйте числовое значение");
                scanner.next();
            }
            lengthArray = scanner.nextInt();
            if (lengthArray <= 0) {
                System.out.println("Размер не может быть отрицательным или равным нулю");
            } else {
                break;
            }

        }
        array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sumElements += array[i];
        }

        Arrays.sort(array);
        System.out.println("Минимальное значение: " + array[0]);
        System.out.println("Среднее значение: " + sumElements / array.length);
        System.out.println("Максимальное значение: " + array[lengthArray - 1]);
        }




}




