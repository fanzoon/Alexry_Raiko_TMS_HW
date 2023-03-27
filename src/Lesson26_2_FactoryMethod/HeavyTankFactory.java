package Lesson26_2_FactoryMethod;

public class HeavyTankFactory implements TankFactory {
    @Override
    public Tank createTank() { return new HeavyTank(); }
}
