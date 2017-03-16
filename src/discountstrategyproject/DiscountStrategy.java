package discountstrategyproject;

/**
 *
 * @author Aaron
 */
//the purpose of this interface is to provide an abstract method
//that will calc the amount and return the discountAmount when implemented
//by the subclasses
public interface DiscountStrategy {
    
    public abstract void calculateDiscountAmount(int quantity, double retailPrice);

    //will this come from the inMemoryDataAccess in the subclasses?
}
