import java.util.List;

public class ResicoTaxCalculator implements TaxCalculator {

    private final List<TaxBracket> brackets;

    public ResicoTaxCalculator() {
        this.brackets = ResicoTaxConfig.getBrackets();
    }

    @Override
    public double calculate(double income) {
        double tax = 0;
        double remaining = income;
        double previousLimit = 0;

        for (TaxBracket bracket : brackets) {
            double taxable = Math.min(
                    remaining,
                    bracket.getUpperLimit() - previousLimit
            );

            if (taxable <= 0) break;

            tax += taxable * bracket.getRate();
            remaining -= taxable;
            previousLimit = bracket.getUpperLimit();
        }

        return tax;
    }
}
