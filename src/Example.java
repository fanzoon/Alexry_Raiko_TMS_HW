import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array;
        int counter = 0;
        int[] secondarray;

        while (true) {
            System.out.println("Input size of array");
            int arraySize = scanner.nextInt();
            if (arraySize <= 5 || arraySize > 10) {
                System.out.println("Input value of size in range " + "from 6 to 10 including");
            } else {
                array = new int[arraySize];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter ++;
            }
        }

        secondarray = new int[counter];
        for (int i = 0, j =0; i < array.length; i++) {
            if (array[i] % 2 == 0 && counter != 0) {
                secondarray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(secondarray));

    }

}
