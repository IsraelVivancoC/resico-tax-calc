public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = new ResicoTaxCalculator();

        double income = 100_000;
        double tax = calculator.calculate(income);

        System.out.println("Income: " + income);
        System.out.println("RESICO tax: " + tax);
    }
}
