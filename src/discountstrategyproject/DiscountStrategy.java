package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public interface DiscountStrategy {
    
    //the purpose of this method is to calc the amount and return the discountAmount
    public abstract void calculateDiscountAmount(int quantity, double retailPrice);

    //will this come from the inMemoryDataAccess in the subclasses?
}
