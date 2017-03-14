package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class Receipt {
    
    private ConsoleOutput consoleOutput = new ConsoleOutput();
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

    public final void calculateNetTotal(double netTotal) {
        //add the fields from the line item class? (all the subtotals added but 
        //no discount at this point)
    }

    public final void calculateGrandTotal() {
        //calculateNetTotal() - discount (how will this be obtained)
    }
    
    //do I need to call the output strategy here or will the startup just
    //perform that? Will this method just run in the output display method
    //in the console class and gui class?
    
    //I'm beginning to think this needs to be in the subclasses that
    //deal with display because I don't know what else they would be good for
    
    //this seems janky
    //JOptionPane("receipt stuff here")
    
    //does this method need to get moved to the gui and console output classes?
    public final void displayReceipt() {
        consoleOutput.display("Thank you for shopping at Kohls \n");
        //this line will pass in the customer that is linked to the ID in the database
        //remember that this will be null if no match is found so have a quality
        //in the method that will allow for that
        consoleOutput.display("Sold to: \n");
        //this value would be hardcoded I'd imagine in the startup class
        consoleOutput.display("Receipt No.: \n\n");
        consoleOutput.display("ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n");
        consoleOutput.display("------------------------------------------------------- \n");
        //have a while loop here for the line items
        consoleOutput.display("Line Item goes here");
        consoleOutput.display("-------");
        
        //these three lines will make use of the formatter (f) so that the values can be 
        //rounded to the nearest decimal place. Convert these later
        consoleOutput.display("Net Total: \n");
        consoleOutput.display("Total Savings: \n");
        consoleOutput.display("Amount Due: \n");
    }
    
    
    
    
}
