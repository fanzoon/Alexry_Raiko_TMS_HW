package Lesson26_2_FactoryMethod;

public class MediumTankFactory implements TankFactory {
    @Override
    public Tank createTank() {
        return new MediumTank();
    }
}
