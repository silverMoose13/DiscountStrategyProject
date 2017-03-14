package discountstrategyproject;

/**
 *
 * @author Aaron
 */

//this class needs some serious work into what it needs to do.
//should many of the things in the receipt class go in here instead?

//the job of this class is to facilitate the transaction
//creating the new receipt
//adding the products to the Receipt
//signaling the end of the transaction by generating the final receipt
public class PointOfSaleTerminal {
    
    private Receipt receipt;
    private OutputStrategy outputStrategy;
    
    public final void createNewReceipt(String customerId) {
        receipt = new Receipt();
    }
    
    public final void addNewProductToReceipt() {
        //make later
    }
    
    public final void closeoutReceipt() {
        //make later
    }
    
}
