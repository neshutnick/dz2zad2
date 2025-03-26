public class Main {
    public static void main(String[] args) {

        int balance = 350; //начальный баланс
        int payment = 1135; //сумма пополнения
        int porog = 1000; //бонусный порог
        int bonus; // переменная для бонуса
        int result; //переменная для итогового баланса

        if (payment >= porog) {
            bonus = payment / 100;

        } else {
            bonus = 0;
        }

        result = balance + payment + bonus;

        System.out.println("Бонус:" + bonus);
        System.out.println(("Баланс:" + result));
    }
}
