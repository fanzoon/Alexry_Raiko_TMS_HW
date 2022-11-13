public class MASSIV {

    public static void main(String[] args) {
        String [] guests = new String[4];
        System.out.println(guests[0]);
        System.out.println(guests[1]);
        System.out.println(guests[2]);
        System.out.println(guests[3]);
        System.out.println("---------------");
        guests[1] = "Alexey";
        System.out.println(guests[0]);
        System.out.println(guests[1]);
        System.out.println(guests[2]);
        System.out.println(guests[3]);

        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[1]);

        boolean[] booleans = new boolean[3];
        System.out.println(booleans[0] + ", " + booleans[1] + ", " + booleans[2]);

        double[] doubles = new double[3];
        System.out.println(doubles[0] + ", " + doubles[1] + ", " + doubles[2]);

        char[] chars = new char[3];
        System.out.println((int) chars[0] + ", " + chars[1] + ", " + chars[2]);
    }

}
