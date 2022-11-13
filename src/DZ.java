public class DZ {

    public static void main(String[] args) {
        String[] guests = new String[6];
        guests[0] = "Петрова";
        guests = new String[5];
        guests[0] = "Петрова";
        guests[1] = "Сидоров";
        guests[2] = "Иванов";
        System.out.println(guests[0]);
        System.out.println(guests[1]);
        System.out.println(guests[2]);
        System.out.println(guests[3]);
        System.out.println(guests[4]);
        int[] gifts = new int[5];
        guests[3] = "Синичкин";
        guests[4] = "Стрельцова";
        gifts = new int[] {50,80,120,60,70};
        System.out.println("1. " + guests[0] + " - " +gifts[0]);
        System.out.println("1. " + guests[1] + " - " +gifts[1]);
        System.out.println("1. " + guests[2] + " - " +gifts[2]);
        System.out.println("1. " + guests[3] + " - " +gifts[3]);
        System.out.println("1. " + guests[4] + " - " +gifts[4]);

    }

}
