import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму кредита в диапазоне от 100 тыс. до 5 млн. руб.: ");
        long count = input.nextLong();

        System.out.print("Введите срок кредита в диапазоне от 12 до 36 месяцев: ");
        long term = input.nextLong();

        long creditPayment = (long) service.calculate(count, term);
        System.out.println
                ("Размер ежемесячного платежа при сроке кредита " + count + "на срок " + term + "составит: " + creditPayment + " рублей");
    }
}
