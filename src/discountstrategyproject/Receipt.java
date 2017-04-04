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

    private OutputStrategy outputOne;
    private OutputStrategy outputTwo;
    private ReceiptDataAccessStrategy dataAccess;
    private LineItem[] lineItems;
    private Customer customer;
    private String receiptId;

    public Receipt(String customerId, ReceiptDataAccessStrategy dataAccess,
            OutputStrategy outputOne, OutputStrategy outputTwo) throws NullOrLengthOfZeroException {
        customer = findCustomer(customerId, dataAccess);
        lineItems = new LineItem[0];
        this.outputOne = outputOne;
        this.outputTwo = outputTwo;
    }

    //need a way to access the customer information
    public Customer getCustomer() {
        return customer;
    }

    //need a way to access the product information
    //we do this through the lineItem
    public LineItem[] getLineItem() {
        return lineItems;
    }

    public final String getReceiptId() {
        return receiptId;
    }

    public final void setReceiptId(String receiptId) throws NullOrEmptyException {
        if (receiptId == null || receiptId.isEmpty()) {
            throw new NullOrEmptyException();
        } else {
            this.receiptId = receiptId;
        }
    }

    private final Customer findCustomer(String customerId, ReceiptDataAccessStrategy dataAccess)
            throws NullOrLengthOfZeroException {
        if (customerId == null || customerId.length() == 0) {
            throw new NullOrLengthOfZeroException();
        }
        return dataAccess.findCustomer(customerId, dataAccess);
    }

    //it is the receipts job to add the line item and store it
    public final void addNewLineItemToReceipt(final String productId, int quantity) throws NullOrEmptyException,
            InvalidMinimumQuantityAmountException {
        if (productId == null || productId.isEmpty()) {
            throw new NullOrEmptyException();
        } else if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        LineItem lineItem = new LineItem(productId, quantity, dataAccess);
        addToArray(lineItem);
    }

    //in order to store it, it needs to be added to an array
    private final void addToArray(final LineItem item) throws NullOrEmptyException {
        if (item == null) {
            throw new NullOrEmptyException("Value must not be null.");
        }
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }

    public final double getNetTotal() {
        //set accumulator variable
        double netTotal = 0.00;
        //loop through the line items and their retail prices
        for (LineItem item : lineItems) {
            netTotal += item.getSubTotal();
        }
        return netTotal;
    }

    public final double getTotalSaved(double retailPrice) throws NumberOutOfRangeException,
            InvalidMinimumQuantityAmountException {
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new NumberOutOfRangeException();
        }
        //set accumulator variable
        double totalSaved = 0.00;
        //loop through the line items and their retail prices
        for (LineItem item : lineItems) {
            totalSaved += item.getDiscountAmount(retailPrice);
        }
        return totalSaved;
    }

    public final double getGrandTotal(double retailPrice) throws NumberOutOfRangeException,
            InvalidMinimumQuantityAmountException {
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new NumberOutOfRangeException();
        }
        //just get the difference of the two methods above
        return getNetTotal() - getTotalSaved(retailPrice);
    }

    public final void outputReceipt(ReceiptFormatStrategy format) throws NullOrEmptyException {
        //display the gui receipt
        outputOne.display(format.formatReceipt(this));
        //display the console receipt
        outputTwo.display(format.formatReceipt(this));
    }

}
