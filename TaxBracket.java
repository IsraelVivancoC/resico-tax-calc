public class TaxBracket {

    private final double upperLimit;
    private final double rate;

    public TaxBracket(double upperLimit, double rate) {
        this.upperLimit = upperLimit;
        this.rate = rate;
    }

    public boolean appliesTo(double income) {
        return income <= upperLimit;
    }

    public double calculate(double income) {
        return income * rate;
    }
}
