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

    public final void setFlatAmountOff(double flatAmountOff) throws NumberOutOfRangeException {
        if (flatAmountOff <= 0 || flatAmountOff > 2000) {
            //this is a slight variation of what was typically used
            throw new NumberOutOfRangeException("Flat amount off must not be less than or equal to $0.00. It"
                    + "may also not be greater than $2000.00");
        }
        this.flatAmountOff = flatAmountOff;
    }

    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) throws InvalidMinimumQuantityAmountException, 
            NumberOutOfRangeException {
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new NumberOutOfRangeException();
        }
        return flatAmountOff;
    }

}
