public class Main{
    public static void main(String[] args){

        ResicoTaxCalculator calculator = new ResicoTaxCalculator();

        double tax = calculator.calculateMonthlyTax(
                10000,
                true,
                true
        );

        System.out.println("Tax to pay: " + tax);
    }
}