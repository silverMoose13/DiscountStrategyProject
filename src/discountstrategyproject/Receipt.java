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
    
    private ReceiptDataAccessStrategy rda;
    private LineItem[] lineItem;
    private Customer customer;
    private String receiptId;

    public Receipt(String customerId, ReceiptDataAccessStrategy rda) {
        customer = findCustomer(customerId);
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
    
    public final Customer getCustomer(String customerId) {
        return rda.findCustomer(customerId);
    }
    
    public final void addNewLineItemToReceipt() {
        LineItem item = new LineItem(productId, quantity);
    }
    
        
    private void addToArray(final LineItem item) {
        //build this later but this will go in this class
    }

}
