import java.util.Arrays;
import java.util.List;

public class ResicoTaxConfig {

    private ResicoTaxConfig() {}

    public static List<TaxBracket> getBrackets() {
        return Arrays.asList(
                new TaxBracket(25_000, 0.01),
                new TaxBracket(50_000, 0.015),
                new TaxBracket(100_000, 0.02),
                new TaxBracket(Double.MAX_VALUE, 0.025)
        );
    }
}
