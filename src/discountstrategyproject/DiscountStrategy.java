package discountstrategyproject;

/**
 *
 * @author Aaron
 */
//the purpose of this interface is to provide an abstract method
//that will calc the amount and return the discountAmount when implemented
//by the subclasses
public interface DiscountStrategy {
    
    public double getDiscountAmount(int quantity, double retailPrice);
}
