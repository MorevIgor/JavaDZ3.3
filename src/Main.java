public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int init_amount = 1_000_000; //первоначальная сумма
        double inter_rate = 9.99; //процентная ставка
        int month;// кол-во месяцев
        System.out.println("Начальная сумма кредита: " + init_amount + " руб.");
        System.out.println("На срок : 12 месяцев");
        System.out.println("Процентная ставка: " + inter_rate + "%");
        System.out.println("Ежемесячный платеж составит: " + CreditPaymentService.calculate(init_amount, inter_rate, 12) + " руб.");

        System.out.println();
        System.out.println("Начальная сумма кредита: " + init_amount + " руб.");
        System.out.println("На срок : 24 месяцев");
        System.out.println("Процентная ставка: " + inter_rate + "%");
        System.out.println("Ежемесячный платеж составит: " + CreditPaymentService.calculate(init_amount, inter_rate, 24) + " руб.");

        System.out.println();
        System.out.println("Начальная сумма кредита: " + init_amount + " руб.");
        System.out.println("На срок : 36 месяцев");
        System.out.println("Процентная ставка: " + inter_rate + "%");
        System.out.println("Ежемесячный платеж составит: " + CreditPaymentService.calculate(init_amount, inter_rate, 36) + " руб.");


    }
}
