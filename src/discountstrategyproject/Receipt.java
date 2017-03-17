package discountstrategyproject;

/**
 *
 * @author Aaron
 */

//the responsibility of this class is to get the line item information
//and add it to the receipt

//in order to obtain that information is has to do the following

//Line item class (this will get the line item information ID, Item, Price, Qty, Subtotal, Discount

public class Receipt {
    
    private ReceiptDataAccessStrategy receiptDataAccessStrategy;
    private LineItem lineItem;
    private Customer customer;
    private String receiptId;

    public Receipt(ReceiptDataAccessStrategy receiptDataAccessStrategy, LineItem lineItem, Customer customer, String receiptId) {
        this.receiptDataAccessStrategy = receiptDataAccessStrategy;
        this.lineItem = lineItem;
        this.customer = customer;
        this.receiptId = receiptId;
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
    
    public final void addNewLineItemToReceipt() {
        //make later
    }
    
        
    private void addToArray(final LineItem item) {
        //build this later but this will go in this class
    }

}
