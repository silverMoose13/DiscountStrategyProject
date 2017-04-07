package discountstrategyproject;

/**
 *
 * @author Aaron
 */

//the purpose of this class is to set the customer information and be able to
//retrieve it
public class Customer {
    
    private String customerId;
    private String customerName;
    
    //do we need this?
    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Customer() {
    }

    public final String getCustomerId() {
        return customerId;
    }
    
    //a customer can pay with cash or not have an ID. In this case
    //we want to set it to an empty string
    public final void setCustomerId(String customerId) {
        if (customerId == null) {
            customerId = "";
            this.customerId = customerId;
        } else {
        this.customerId = customerId;
        }
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) throws NullOrLengthOfZeroException {
        if (customerName == null || customerName.length() == 0) {
            throw new NullOrLengthOfZeroException();
        }
        this.customerName = customerName;
    }
    
}
