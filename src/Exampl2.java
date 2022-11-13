import java.util.Random;
import java.util.Scanner;

public class Exampl2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array;
        int[] secondArray;
        int counter = 0;

        while (true) {
            System.out.println("Input size of array");
            int arraySize = scanner.nextInt();
            if (arraySize <= 5 || arraySize > 10) {
                System.out.println("input value of size in range " +
                        "from 6 to 10 including");
            } else {
                array = new int[arraySize];
                break;
            }
        }
    }

}
