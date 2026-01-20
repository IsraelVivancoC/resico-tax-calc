public class TaxBracket {

    private final double upperLimit;
    private final double rate;

    public TaxBracket(double upperLimit, double rate) {
        this.upperLimit = upperLimit;
        this.rate = rate;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getRate() {
        return rate;
    }
}
