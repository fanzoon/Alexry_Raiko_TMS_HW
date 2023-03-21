package Lesson26_2_FactoryMethod;

public class LightTank implements Tank {
    @Override
    public void goPosition() {
        System.out.println("Light tank in position");
    }
}
