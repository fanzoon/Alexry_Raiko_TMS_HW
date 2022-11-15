package Lesson6_task;

public class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard (4000300020021001L, 350);
        card1.numberCard();
        card1.enrollment();
        card1.getCurrentSum();

        CreditCard card2 = new CreditCard (4000300020021002L, 1000);
        card2.numberCard();
        card2.enrollment();
        card2.getCurrentSum();

        CreditCard card3 = new CreditCard (4000300020021001L, 4500);
        card3.numberCard();
        card3.withdrawal();
        card3.getCurrentSum();

    }
}
