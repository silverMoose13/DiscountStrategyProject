package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) {
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity needs to be at least 1.");
        }
        if (retailPrice <= 0) {
            throw new IllegalArgumentException("Retail price needs to be greater than $0.00.");
        }
        return 0;
    }

}
