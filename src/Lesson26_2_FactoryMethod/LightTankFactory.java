package Lesson26_2_FactoryMethod;

public class LightTankFactory implements TankFactory {
    @Override
    public Tank createTank() {
        return new LightTank();
    }
}
