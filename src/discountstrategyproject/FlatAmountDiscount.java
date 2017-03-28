package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class FlatAmountDiscount implements DiscountStrategy {

    double flatAmountOff;

    public FlatAmountDiscount(double flatAmountOff) {
        this.flatAmountOff = flatAmountOff;
    }

    public final double getFlatAmountOff() {
        return flatAmountOff;
    }

    public final void setFlatAmountOff(double flatAmountOff) {
        if (flatAmountOff <= 0 || flatAmountOff > 2000) {
            throw new IllegalArgumentException("Flat amount off must not be less than or equal to $0.00. It"
                    + "may also not be greater than $2000.00");
        }
        this.flatAmountOff = flatAmountOff;
    }

    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) {
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity needs to be at least 1.");
        }
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new IllegalArgumentException("Retail price must not be less than or equal to $0.00. It"
                    + "may also not be greater than $25,000.00");
        }
        return flatAmountOff;
    }

}
