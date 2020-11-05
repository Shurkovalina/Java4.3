public class CreditPaymentService {
    public double calculate(long amount, int number_of_months, double percent){
        double interest_rate = percent/1200;
        double result = (long)(amount*(interest_rate+interest_rate/(Math.pow(1+interest_rate, number_of_months)-1)));
        return result;
    }
}
