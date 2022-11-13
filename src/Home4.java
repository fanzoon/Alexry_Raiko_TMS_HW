import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        int b = 0;

        int[] numbers = new int[] {5, -6, 18, 2, -13, 28};

        for (int n : numbers) {
            if (a == n) {
                b = n;
                System.out.println("Заданное число входит в массив numbers");
            }
        }
        if (b == 0) {
            System.out.println("Заданное число не входит в массив numbers");
        }

    }

}
