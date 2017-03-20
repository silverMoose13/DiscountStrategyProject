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

    private Receipt receipt;

    public PointOfSaleTerminal(String customerId, ReceiptDataAccessStrategy rda) {
        receipt = new Receipt(customerId, rda);
    }

    public PointOfSaleTerminal() {
    }

    public final void createNewReceipt(String customerId, ReceiptDataAccessStrategy rda) {
        //increment the receipt id ++
        receipt = new Receipt(customerId, rda);
    }

    public final void addItemToReceipt(String productId, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Consider adding a formatStrategy for this receipt so that these aren't hardcoded in
    public final String closeoutReceipt() {
        //use the appended string values instead. The other way does not work well

        String receipt = "";

        receipt += "Thank you for shopping at Kohls \n";
        receipt += "Sold to: pass in customer name here \n";
        receipt += "Receipt No.: pass in receipt number here \n\n";
        receipt += "ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n";
        receipt += "------------------------------------------------------- \n";
        receipt += "Line Item goes here";
        //continue to add line items with a loop
        receipt += "-------";
        receipt += "Net Total: pass in calculate net total method here \n";
        receipt += "Total Savings: pass in grandtotal - nettotal methods \n";
        receipt += "Amount Due: pass in grand total method \n";

        return receipt;

        //I performed it this way because I wanted to make use of the String formatter
        //later on
//        outputStrategy.display("Thank you for shopping at Kohls \n");
//        //this line will pass in the customer that is linked to the ID in the database
//        //remember that this will be null if no match is found so have a quality
//        //in the method that will allow for that
//        outputStrategy.display("Sold to: \n");
//        //create a receiptId that would increment here
//        outputStrategy.display("Receipt No.: \n\n");
//        outputStrategy.display("ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n");
//        outputStrategy.display("------------------------------------------------------- \n");
//        //addItemToReceipt
//        outputStrategy.display("Line Item goes here");
//        outputStrategy.display("-------");
//        
//        //these three lines will make use of the formatter (f) so that the values can be 
//        //rounded to the nearest decimal place. Convert these later
//        outputStrategy.display("Net Total: \n");
//        outputStrategy.display("Total Savings: \n");
//        outputStrategy.display("Amount Due: \n");
    }

}
