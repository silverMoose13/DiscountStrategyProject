package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class FlatAmountDiscount implements DiscountStrategy{
    
    double flatAmountOff;

    public FlatAmountDiscount(double flatAmountOff) {
        this.flatAmountOff = flatAmountOff;
    }

    public final double getFlatAmountOff() {
        return flatAmountOff;
    }

    public final void setFlatAmountOff(double flatAmountOff) {
        this.flatAmountOff = flatAmountOff;
    }
    
    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) {
        return flatAmountOff;
    }
    
}
