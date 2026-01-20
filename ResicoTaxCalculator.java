public class ResicoTaxCalculator {

    public double calculateMonthlyTax(
            double monthlyIncome,
            boolean hasIVA,
            boolean applyRounding
    ) {

        double taxRate;

        if (monthlyIncome <= 25000) {
            taxRate = 0.01;
        } else if (monthlyIncome <= 50000) {
            taxRate = 0.015;
        } else if (monthlyIncome <= 100000) {
            taxRate = 0.02;
        } else {
            taxRate = 0.025;
        }

        double tax = monthlyIncome * taxRate;

        if (hasIVA) {
            tax = tax * 1.16;
        }

        if (applyRounding) {
            tax = Math.round(tax * 100.0) / 100.0;
        }

        return tax;
    }
}
