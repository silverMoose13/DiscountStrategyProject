package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class Receipt {
    
    private ReceiptDataAccessStrategy receiptDataAccessStrategy;
    private Customer customer;
    private String receiptId;
    
    public Receipt(String customerId, ReceiptDataAccessStrategy receiptDataAccessStrategy) {
        //need constructor still
    }
    
    public final String getReceiptId() {
        return receiptId;
    }
    
    public final void setReceiptId(String receiptId) {
        if (receiptId == null || receiptId.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        }
        else {
        this.receiptId = receiptId;
        }
    }
    
    public final void addNewProductToReceipt() {
        //make later
    }
    
    public final void addNewLineItemToReceipt() {
        //make later
    }
    
        
    private void addToArray(final LineItem item) {
        //build this later but this will go in this class
    }

}
