package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class FlatAmountDiscount implements DiscountStrategy{

    //not sure if this is the method we want to go about this
    //I'm almost thinking this should just be calculate discount amount
    //refer to the tip calculator example for the variation here
    private String discountType;

    public final String getDiscountType() {
        return discountType;
    }

    public final void setDiscountType(String discountType) {
        if (discountType == null || discountType.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        } else {
        this.discountType = discountType;
        }
    }
    
    @Override
    public final void calculateDiscountAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
