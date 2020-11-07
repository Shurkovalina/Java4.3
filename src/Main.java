public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1 = service.calculate(1_000_000, 12, 9.99);
        System.out.println(monthlyPayment1);
        double monthlyPayment2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(monthlyPayment2);
        double monthlyPayment3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(monthlyPayment3);
    }
}