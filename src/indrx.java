public class indrx {

    public static void main(String[] args) {
        double height = 78.0;
        double weight = 1.79;
        double index = height / (weight * weight);
        System.out.println("ИМТ = " + index);
        if (index < 16) {
            System.out.println("Дефицит массы тела");
        }
        if (index > 16 && index <= 18.5) {
            System.out.println("Недостаточная масса тела");
        }
        if (index > 18.5 && index <= 25) {
            System.out.println("Норма");
        }
        if (index > 25 && index <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        }
        if (index > 30 && index <= 35) {
            System.out.println("Ожирение первой степени");
        }
        if (index > 35 && index <= 40) {
            System.out.println("Ожирение второй степени");
        }
        if (index > 40) {
            System.out.println("Ожирение третей степени");
        }
    }

}
