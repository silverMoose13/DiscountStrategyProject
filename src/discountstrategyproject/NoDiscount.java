package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NoDiscount implements DiscountStrategy {
    
    @Override
    public final void calculateDiscountAmount(int quantity, double retailPrice) {
        //this will just return 0?
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
