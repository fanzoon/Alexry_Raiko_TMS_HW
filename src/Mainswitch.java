public class Mainswitch {

    public static void main(String[] args) {
        int washingmod = 5;
        // 0 - Выкл
        // 1 - Хлопок
        // 2 - Синтетика
        // 3 - Шолк
        // 4 - Шерсть
        switch (washingmod) {
            case 0:
                System.out.println("Стиральная машина выключается...");
                break;
            case 1:
                System.out.println("Включается режим стирки хлопка");
                break;
            case 2:
                System.out.println("Включается режим стирки синтетики");
                break;
            case 3:
                System.out.println("Включается режим стирки шелка");
                break;
            case 4:
                System.out.println("Включается режим стирки шерсти");
                break;
            default:
                System.out.println("Выбран неверный режим");
        }

    }

}
