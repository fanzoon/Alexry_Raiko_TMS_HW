import java.util.Scanner;

public class апр {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        System.out.println("число " + n);

        if (n > 0 && n < 15) {
            System.out.println("Группа 1");
            for (int i = 0; i < 1; i++ ) {
                System.out.println("Вы, я вижу, бескорыстно любите деньги");
            }
        } else if (n >= 15 && n < 30) {
            System.out.println("Группа 2");
            for (int i = 0; i < 2; i++ ) {
                System.out.println("Вы, я вижу, бескорыстно любите деньги");
            }
        }else if (n >= 30) {
            System.out.println("Группа 3");
            for (int i = 0; i < 3; i++ ) {
                System.out.println("Вы, я вижу, бескорыстно любите деньги");
            }
        } else {
            System.out.println("Введенное число не в диапазоне");
        }



    }

}
