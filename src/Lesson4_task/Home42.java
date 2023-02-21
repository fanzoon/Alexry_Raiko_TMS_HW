package Lesson4_task;

import java.util.Arrays;
import java.util.Scanner;

public class Home42 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        double a = 0;

        double[] randoms = new double[n];
        for (int i = 0; i < n; i++) {
            randoms[i] = Math.random();
            a = a + randoms[i];
        }
        Arrays.sort(randoms);
        System.out.println("Массив: " + Arrays.toString(randoms));
        System.out.println(randoms[0]);
        System.out.println(randoms[n -1]);
        System.out.println(a = randoms[n / 2]);
    }
}
