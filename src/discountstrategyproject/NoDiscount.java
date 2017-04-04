package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) throws InvalidMinimumQuantityAmountException, 
            NumberOutOfRangeException {
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        //this is slightly different than the most common one used, so the 1 arg constructor is used here
        if (retailPrice <= 0) {
            throw new NumberOutOfRangeException("Retail price needs to be greater than $0.00.");
        }
        return 0;
    }

}
