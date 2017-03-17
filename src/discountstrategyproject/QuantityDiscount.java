package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class QuantityDiscount implements DiscountStrategy{
    
    private double minimumQuantityNeededForDiscount;
    private double percentageOff;

    public QuantityDiscount(double minimumQuantityNeededForDiscount, double percentageOff) {
        this.minimumQuantityNeededForDiscount = minimumQuantityNeededForDiscount;
        this.percentageOff = percentageOff;
    }

    public double getMinimumQuantityNeededForDiscount() {
        return minimumQuantityNeededForDiscount;
    }

    public void setMinimumQuantityNeededForDiscount(double minimumQuantityNeededForDiscount) {
        this.minimumQuantityNeededForDiscount = minimumQuantityNeededForDiscount;
    }
    
    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) {
        double discountAmount = 0;
        
        if (quantity >= minimumQuantityNeededForDiscount) {
            discountAmount = quantity * retailPrice * percentageOff;
        }
        return discountAmount;
        
    }
    
}
