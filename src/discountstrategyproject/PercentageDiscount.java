package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percentageOff;

    public PercentageDiscount(double percentageOff) {
        if (percentageOff > 0.95 || percentageOff < 0.00) {
            throw new IllegalArgumentException("Percentage off needs to be greater than 0% and cannot"
                    + " exceed 95%.");
        }
        this.percentageOff = percentageOff;
    }

    public final double getPercentageOff() {
        return percentageOff;
    }

    public final void setPercentageOff(double percentageOff) {
        if (percentageOff > 0.95 || percentageOff < 0.00) {
            throw new IllegalArgumentException("Percentage off needs to be greater than 0% and cannot"
                    + " exceed 95%.");
        }
        this.percentageOff = percentageOff;
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

        return retailPrice * quantity * percentageOff;
    }

}
