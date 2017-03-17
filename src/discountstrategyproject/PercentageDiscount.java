package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class PercentageDiscount implements DiscountStrategy{
    
    private double percentageOff;

    public PercentageDiscount(double percentageOff){
        this.percentageOff = percentageOff;
    }

    public final double getPercentageOff() {
        return percentageOff;
    }

    public final void setPercentageOff(double percentageOff) {
        this.percentageOff = percentageOff;
    }
    
    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) {
        return retailPrice * quantity * percentageOff;
    }
    
}
