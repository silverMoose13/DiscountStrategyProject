package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class Customer {
    
    private String customerId;
    private String customerName;
    
    //do we need this?
    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
    
    public Customer() {}

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        } else {
        this.customerId = customerId;
        }
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        } else {
        this.customerName = customerName;
        }
    }
    
}
