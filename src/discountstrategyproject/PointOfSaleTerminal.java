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
    
    //use liskov substitution principle
    private OutputStrategy outputOne = new ConsoleOutput();
    private OutputStrategy outputTwo = new GuiOutput();
    private Receipt receipt;
    private OutputStrategy outputStrategy;
    
    public final void createNewReceipt(String customerId, ReceiptDataAccessStrategy dataAccess) {
        //increment the receipt id ++
    }
    
    public final void closeoutReceipt() {
        //this needs to be a string that is appended and then change this to have a return type?
        
        outputOne.display("Thank you for shopping at Kohls \n");
        //this line will pass in the customer that is linked to the ID in the database
        //remember that this will be null if no match is found so have a quality
        //in the method that will allow for that
        outputOne.display("Sold to: \n");
        //this value would be hardcoded I'd imagine in the startup class
        outputOne.display("Receipt No.: \n\n");
        outputOne.display("ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n");
        outputOne.display("------------------------------------------------------- \n");
        //addItemToReceipt
        outputOne.display("Line Item goes here");
        outputOne.display("-------");
        
        //these three lines will make use of the formatter (f) so that the values can be 
        //rounded to the nearest decimal place. Convert these later
        outputOne.display("Net Total: \n");
        outputOne.display("Total Savings: \n");
        outputOne.display("Amount Due: \n");
    }
    
}
