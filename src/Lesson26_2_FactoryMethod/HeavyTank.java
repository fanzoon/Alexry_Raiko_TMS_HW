package Lesson26_2_FactoryMethod;

public class HeavyTank implements Tank {

    @Override
    public void goPosition() {
        System.out.println("Heavy tank in position!");
    }
}
