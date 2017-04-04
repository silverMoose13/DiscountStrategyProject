package discountstrategyproject;

/**
 *
 * @author Aaron
 */
//the job of this class is to facilitate the transaction:
//1) creating the new receipt
//2) modifying the receipt
//3) signaling the end of the transaction by generating the final receipt in two dif output forms
//Essentially this class needs to talk to the receipt class
public class PointOfSaleTerminal {

    private OutputStrategy outputOne;
    private OutputStrategy outputTwo;
    private Receipt receipt;

    public PointOfSaleTerminal(OutputStrategy outputOne, OutputStrategy outputTwo, Receipt receipt) {
        this.outputOne = outputOne;
        this.outputTwo = outputTwo;
        this.receipt = receipt;
    }

    public PointOfSaleTerminal() {
    }

    public final void createNewReceipt(String customerId, ReceiptDataAccessStrategy dataAccess,
            OutputStrategy outputOne, OutputStrategy outputTwo) throws NullOrLengthOfZeroException {
        if (customerId == null || customerId.length() == 0) {
            throw new NullOrLengthOfZeroException();
        }
        receipt = new Receipt(customerId, dataAccess, outputOne, outputTwo);
    }

    public final void addLineItemToReceipt(String productId, int quantity) throws NullOrEmptyException, 
         InvalidMinimumQuantityAmountException {
        if (productId == null || productId.isEmpty()) {
            throw new NullOrEmptyException();
        } else if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        receipt.addNewLineItemToReceipt(productId, quantity);
    }

    //Consider adding a formatStrategy for this receipt so that these aren't hardcoded in
    public final void closeoutReceipt(ReceiptFormatStrategy format) throws NullOrEmptyException {
        receipt.outputReceipt(format);
    }

}
