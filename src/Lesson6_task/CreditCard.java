package Lesson6_task;

import java.util.Scanner;

public class CreditCard {

    long accountNumber;                                                      // Номер счета
    double currentSum;                                                       // Текущая сумма на карте

    public CreditCard (long accountNumber, double currentSum) {              // Создание конструктора
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public int card;
    public int numberCard () {
        while (true) {
            System.out.println("input number of card:");
            Scanner scanner = new Scanner(System.in);
            card = scanner.nextInt();
            if ( card < 0 || card >3) {
                System.out.println("Такой карты не существует!");
            } else {
                card = card;
                break;
            }
        }
        return card;
    }

    public double enrollment () {                                            // Зачисление на карту
        double sum;                                                          // Сумма, которая зачисляется на карту
        System.out.println("Введите сумму, которую хотите зачислить на card" + card);
        Scanner scanner1 = new Scanner(System.in);
        sum = scanner1.nextInt();
        currentSum += sum;
        return currentSum;
    }

    public double withdrawal () {                                            // Снятие денег с карты
        double sum2;                                                          // Сумма, которая снимается с карты
        System.out.println("Введите сумму, которую хотите снять c card" + card);
        Scanner scanner4 = new Scanner(System.in);
        sum2 = scanner4.nextInt();
        currentSum -= sum2;
        return currentSum;
    }

    public void getCurrentSum () {
        System.out.println("Текущее состояние счета на card" + card + ": " + currentSum);
    }
}
