public class CreditPaymentService {

        public double calculate(double count, double term) {
            if (count >= 100_000 && count <= 5_000_000);
            else return -1;

            if (term >= 12 && term <= 36);
            else return -1;

            double rateMonth = 9.99/100/12;
            double creditPayment = count * (rateMonth + rateMonth / (Math.pow(1 + rateMonth, term) - 1));
            return creditPayment;

        }
}
