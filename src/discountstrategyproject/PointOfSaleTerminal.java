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

    public PointOfSaleTerminal(OutputStrategy outputStrategy, Receipt receipt) {
        this.outputStrategy = outputStrategy;
        this.receipt = receipt;
    }
    
    public PointOfSaleTerminal() {}
    
    public final void createNewReceipt(String customerId, ReceiptDataAccessStrategy dataAccess) {
        //increment the receipt id ++
        receipt = new Receipt(customerId, dataAccess);
    }
    
    //I'm confused here on how this should be called in startup
    public final void closeoutReceipt() {
        //I performed it this way because I wanted to make use of the String formatter
        //later on
        
        outputStrategy.display("Thank you for shopping at Kohls \n");
        //this line will pass in the customer that is linked to the ID in the database
        //remember that this will be null if no match is found so have a quality
        //in the method that will allow for that
        outputStrategy.display("Sold to: \n");
        //create a receiptId that would increment here
        outputStrategy.display("Receipt No.: \n\n");
        outputStrategy.display("ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n");
        outputStrategy.display("------------------------------------------------------- \n");
        //addItemToReceipt
        outputStrategy.display("Line Item goes here");
        outputStrategy.display("-------");
        
        //these three lines will make use of the formatter (f) so that the values can be 
        //rounded to the nearest decimal place. Convert these later
        outputStrategy.display("Net Total: \n");
        outputStrategy.display("Total Savings: \n");
        outputStrategy.display("Amount Due: \n");
    }
    
}
