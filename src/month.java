public class month {

    public static void main(String[] args) {
        int month = 13;

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        if (month == 1 || month == 2 || month ==12 ) {
            System.out.println("Зима");
        } else if (month >= 3 && month <6) {
            System.out.println("весна");
        } else if (month >= 6 && month <9) {
            System.out.println("Лето");
        } else if (month >= 9 && month <12) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца не существует");
        }

    }

}
