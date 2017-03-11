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

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        //need validation
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        //need validation
        this.customerName = customerName;
    }
    
}
