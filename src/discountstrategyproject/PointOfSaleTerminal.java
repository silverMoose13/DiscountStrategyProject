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

    private OutputStrategy output;
    private Receipt receipt;

    public PointOfSaleTerminal(OutputStrategy outputOne, OutputStrategy outputTwo) {
        this.output = outputOne;
        this.output = outputTwo;
    }
    
    public PointOfSaleTerminal() {}

    public final void createNewReceipt(String customerId, ReceiptDataAccessStrategy dataAccess,
            OutputStrategy outputOne, OutputStrategy outputTwo) {
        //increment the receipt id ++
        receipt = new Receipt(customerId, dataAccess, outputOne, outputTwo);
    }

    public final void addLineItemToReceipt(String productId, int quantity) {
        receipt.addNewLineItemToReceipt(productId, quantity);
    }

    //Consider adding a formatStrategy for this receipt so that these aren't hardcoded in
    public final String closeoutReceipt(ReceiptFormatStrategy format) {
        return format.formatReceipt(receipt);
    }

}
