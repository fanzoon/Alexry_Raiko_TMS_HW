package Lesson26_2_FactoryMethod;

public class MediumTank implements Tank{
    @Override
    public void goPosition() {
        System.out.println("Medium tank in position!");
    }
}
