package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NoDiscount implements DiscountStrategy {
    
    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) {
        return 0;
    }
    
}
