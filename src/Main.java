public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int balance = 257; // Начальный баланс
        int payment = 1500; // Сумма платежа
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        }
        int newBalance = balance + payment + bonus;
        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговый счет = " + newBalance);
    }
}