public class Task {

    public static void main(String[] args) {
        byte ton = 1;
        short kilogram = (short) (ton * 1000);
        int gram = (int) (kilogram * 1000);
        int milligram = (gram * 1000);
        System.out.println("В " + ton + " тонне " + kilogram
                + " килограмм, " + gram + " грамм и " + milligram + " милиграмм.");

        byte year = 3;
        byte month = (byte) (year * 12);
        short day = (short) (month * 30);
        short hour = (short) (day * 24);
        int minuts = (int) (hour * 60);
        int second = (minuts * 60);
        long millisecond = (long) (second * 60l);
        System.out.println("В " + year + " году " + month + " месяцев, " + day + " дней, " +
                hour + " часов, " + minuts + " минут, " + second + " секунд и " + millisecond + " милисекунд.");



    }

}
