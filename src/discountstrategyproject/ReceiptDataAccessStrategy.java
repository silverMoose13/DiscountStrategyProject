package discountstrategyproject;

/**
 *
 * @author Aaron
 */

//getting the customer and product information and how it is obtained
//can vary. This example only has one way of retrieving data (in memory)
public interface ReceiptDataAccessStrategy {
    
    public abstract Customer findCustomer(final String customerId, ReceiptDataAccessStrategy dataAccess);
    public abstract Product findProduct(final String productId, ReceiptDataAccessStrategy dataAccess);
    
}
