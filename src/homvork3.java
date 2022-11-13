public class homvork3 {

    public static void main(String[] args) {
        int a = 20;
        if (a > 0 && a < 15) {
            System.out.println("Группа 1");
            for (int i = 0; i < 1; i++ ) {
                System.out.println("Вы, я вижу, бескорыстно любите деньги");
            }
        } else if (a >= 15 && a < 30) {
            System.out.println("Группа 2");
            for (int i = 0; i < 2; i++ ) {
                System.out.println("Вы, я вижу, бескорыстно любите деньги");
            }
        }else if (a >= 30) {
            System.out.println("Группа 3");
            for (int i = 0; i < 3; i++ ) {
                System.out.println("Вы, я вижу, бескорыстно любите деньги");
            }
        } else {
            System.out.println("Введенное число не в диапазоне");
        }

    }

}
