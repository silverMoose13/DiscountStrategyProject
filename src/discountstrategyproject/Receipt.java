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
    
    private ReceiptDataAccessStrategy dataAccess;
    private LineItem[] lineItems;
    private Customer customer;
    private String receiptId;

    public Receipt(String customerId, ReceiptDataAccessStrategy dataAccess) {
        customer = findCustomer(customerId, dataAccess);
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
    
    private final Customer findCustomer(String customerId, ReceiptDataAccessStrategy dataAccess) {
        return dataAccess.findCustomer(customerId, dataAccess);
    }
    
    //it is the receipts job to add the line item and store it
    public final void addNewLineItemToReceipt(final String productId, int quantity) {
        LineItem lineItem = new LineItem(productId, quantity, dataAccess);
        addToArray(lineItem);
    }
    
    //in order to store it, it needs to be added to an array
    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }

}
