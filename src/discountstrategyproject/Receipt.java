package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class Receipt {
    
    private Customer customer;
    private LineItem[] lineItem;
    private String receiptId;
    
    //need constructor still
    
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
    
    //build this later but this will go in this class
//    private void addToArray(final LineItem item) {
//        // needs validation
//        LineItem[] tempItems = new LineItem[lineItems.length + 1];
//        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
//        tempItems[lineItems.length] = item;
//        lineItems = tempItems;
//        tempItems = null;
//    }
    
    public final void addNewProductToReceipt() {
        //make later
    }
    
    public final void addNewLineItemToReceipt() {
        //make later
    }

}
