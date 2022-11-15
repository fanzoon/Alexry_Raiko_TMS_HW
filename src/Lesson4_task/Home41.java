package Lesson4_task;

import java.util.Arrays;
import java.util.Scanner;

public class Home41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();    // ввожу число с клавиатуры
        int b = 1;

        int[] numbers = {7, 4, 18, -11, 1, 22, 8};
        for (int i =0; i < numbers.length; i++) {
            if (a == numbers[i]) {
                numbers[i] = 0;
                b = numbers[i];
                System.out.println(Arrays.toString(numbers));
            }
        }
        if (b != 0) {
            System.out.println("Такого числа в массиве нет");
        }
    }
}
