package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class QuantityDiscount implements DiscountStrategy{
    
    private int minimumQuantityNeededForDiscount;
    private double percentageOff;

    public QuantityDiscount(int minimumQuantityNeededForDiscount, double percentageOff) {
        this.minimumQuantityNeededForDiscount = minimumQuantityNeededForDiscount;
        this.percentageOff = percentageOff;
    }

    public final double getMinimumQuantityNeededForDiscount() {
        return minimumQuantityNeededForDiscount;
    }

    //quantity minimum should be at least 2 because if it was just 1
    //this discount would not be unique.
    public final void setMinimumQuantityNeededForDiscount(int minimumQuantityNeededForDiscount)
    throws InvalidMinimumQuantityAmountException {
        if (minimumQuantityNeededForDiscount < 2) {
            //calls the 1 param exception
            throw new InvalidMinimumQuantityAmountException("Minimum quantity needs to be at least 2.");
        }
        this.minimumQuantityNeededForDiscount = minimumQuantityNeededForDiscount;
    }
    
    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) throws
            InvalidMinimumQuantityAmountException, NumberOutOfRangeException {
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new NumberOutOfRangeException();
        }
        
        double discountAmount = 0;
        
        if (quantity >= minimumQuantityNeededForDiscount) {
            discountAmount = quantity * retailPrice * percentageOff;
        }
        return discountAmount;
        
    }
    
}
