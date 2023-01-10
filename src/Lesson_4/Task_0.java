package Lesson_4;

import java.util.Scanner;

public class Task_0 {
//    Task 0:
//    0.1  Создайте массив целых чисел.
//    0.2  Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
//    0.3  Пусть число для поиска задается с консоли (класс Scanner).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int[] array = {3, 7, 1, 14, 13, 6, 24};

        for (int x: array) {
            if(x == n) {
                System.out.println("Заданное число входит в массив array");
            } else {
                System.out.println("Заданное число не входит в массив array");
            }break;
        }

    }
}
