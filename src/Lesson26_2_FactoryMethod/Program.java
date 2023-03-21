package Lesson26_2_FactoryMethod;

public class Program {
    public static void main(String[] args) {
        TankFactory tankFactory = Service.createTankOfType("heavy");
        Tank tank = tankFactory.createTank();

        tank.goPosition();
    }
}
