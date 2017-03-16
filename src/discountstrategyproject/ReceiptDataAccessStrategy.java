package discountstrategyproject;

/**
 *
 * @author Aaron
 */

//getting the customer and product information and how it is obtained
//can vary. This example only has one way of retrieving data (in memory)
public interface ReceiptDataAccessStrategy {
    
    public abstract Customer getCustomerInformation(final String customerId);
    public abstract Product getProductInformation(final String productId);
    
}
