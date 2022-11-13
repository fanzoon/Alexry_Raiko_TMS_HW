public class Angle {

    public static void main(String[] args) {
        short degreeAngle = 360;
        if (degreeAngle > 0 && degreeAngle < 90) {
            System.out.println("Этот угол острый");
        }
        if (degreeAngle == 90) {
            System.out.println("Этот угол прямой");
        }
        if (degreeAngle > 90 && degreeAngle < 180) {
            System.out.println("Этот угол тупой");
        }
        if (degreeAngle == 180) {
            System.out.println("Этот угол развернутый");
        }
        if (degreeAngle > 180 && degreeAngle < 360) {
            System.out.println("Этот угол выпуклый");
        }
        if (degreeAngle == 360) {
            System.out.println("Этот угол полный");
        }

    }

}
