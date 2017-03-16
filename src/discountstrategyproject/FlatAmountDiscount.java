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
    public final void calculateDiscountAmount(int quantity, double retailPrice) {
        //this will need to access the products array in the in memory data access class?
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
