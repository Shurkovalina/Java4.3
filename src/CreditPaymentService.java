public class CreditPaymentService {
    public double calculate(long amount, int numberOfMonths, double percent) {
        double interestRate = percent / 1200;
        double denominator = (Math.pow(1 + interestRate, numberOfMonths) - 1);
        double result = (long) (amount * (interestRate + interestRate / denominator));
        return result;
    }
}
