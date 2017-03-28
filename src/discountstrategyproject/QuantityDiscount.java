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
    public final void setMinimumQuantityNeededForDiscount(int minimumQuantityNeededForDiscount) {
        if (minimumQuantityNeededForDiscount < 2) {
            throw new IllegalArgumentException("Minimum quantity needs to be at least 2.");
        }
        this.minimumQuantityNeededForDiscount = minimumQuantityNeededForDiscount;
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
        
        double discountAmount = 0;
        
        if (quantity >= minimumQuantityNeededForDiscount) {
            discountAmount = quantity * retailPrice * percentageOff;
        }
        return discountAmount;
        
    }
    
}
