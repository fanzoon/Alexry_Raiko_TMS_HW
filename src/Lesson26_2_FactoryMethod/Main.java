package Lesson26_2_FactoryMethod;

public class Main {
    public static void main(String[] args) {
//        try {
//            TankFactory tankFactory = Service.createTankFactory("heavy");
//            Tank tank = tankFactory.createTank();
//            tank.goPosition();
//        } catch (ClassCastException e) {
//            System.out.println("Введён неверный тип танка. Повторите попытку");
//        }

        TankFactory tankFactory = Service.createTankFactory("heavy");
        Tank tank = tankFactory.createTank();
        tank.goPosition();

    }
}
