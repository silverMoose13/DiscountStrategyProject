package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percentageOff;

    public PercentageDiscount(double percentageOff) {
        this.percentageOff = percentageOff;
    }

    public final double getPercentageOff() {
        return percentageOff;
    }

    public final void setPercentageOff(double percentageOff) throws NumberOutOfRangeException{
        if (percentageOff > 0.95 || percentageOff < 0.00) {
            //slightly different version
            throw new NumberOutOfRangeException("Percentage off needs to be greater than 0% and cannot"
                    + " exceed 95%.");
        }
        this.percentageOff = percentageOff;
    }

    @Override
    public final double getDiscountAmount(int quantity, double retailPrice) throws InvalidMinimumQuantityAmountException, 
            InvalidMinimumQuantityAmountException{
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new InvalidMinimumQuantityAmountException();
        }

        return retailPrice * quantity * percentageOff;
    }

}
