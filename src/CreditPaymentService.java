public class CreditPaymentService {
    public static double calculate(int init_amount, double inter_rate, int month) {
        double inter_rate_m = inter_rate / 1200; // процентная ставка на месяц
        double inter_rate_mod = 1 + inter_rate_m; // промежуточная операция
        int m = month - 1; //-1 месяц, т.к . oper уже заложен этот месяц
        double oper = inter_rate_mod;
        while (m > 0) {//возведение в степень
            oper *= inter_rate_mod;
            m--;
        }
        double m_payment_a = init_amount * (inter_rate_m + (inter_rate_m / (oper - 1)));//окончательный рассчет
        int m_payment = (int) m_payment_a;//преобразование числа

        return m_payment;
    }
}
