public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthly_payment = service.calculate(1_000_000, 36, 9.99);
        System.out.println(monthly_payment);
    }
}
