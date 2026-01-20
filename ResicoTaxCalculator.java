import java.util.Arrays;
import java.util.List;

public class ResicoTaxCalculator implements TaxCalculator {

    private final List<TaxBracket> brackets = Arrays.asList(
            new TaxBracket(25_000, 0.01),
            new TaxBracket(50_000, 0.015),
            new TaxBracket(100_000, 0.02),
            new TaxBracket(Double.MAX_VALUE, 0.025)
    );

    @Override
    public double calculate(double income) {
        if (income <= 0) {
            return 0.0;
        }

        for (TaxBracket bracket : brackets) {
            if (bracket.appliesTo(income)) {
                return bracket.calculate(income);
            }
        }

        return 0.0;
    }
}
