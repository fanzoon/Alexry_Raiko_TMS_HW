package Lesson26_2_FactoryMethod;

public class Service {

    static TankFactory createTankFactory(String typeOfTank) {
        if (typeOfTank.equalsIgnoreCase("heavy")) {
            return new HeavyTankFactory();
        } else if (typeOfTank.equalsIgnoreCase("medium")) {
            return new MediumTankFactory();
        } else if (typeOfTank.equalsIgnoreCase("light")) {
            return new LightTankFactory();
        }  else {
            return (TankFactory) new Object();
        }
    }
}
