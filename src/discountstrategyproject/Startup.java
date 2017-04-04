package discountstrategyproject;

/**
 *
 * @author agnas
 */
public class Startup {
    public static void main(String[] args) throws NullOrLengthOfZeroException, NullOrEmptyException, 
            InvalidMinimumQuantityAmountException {
        
        PointOfSaleTerminal posTerminal = new PointOfSaleTerminal();
        ReceiptDataAccessStrategy dataAccess = new InMemoryDataAccess();
        
        OutputStrategy outputOne = new ConsoleOutput();
        OutputStrategy outputTwo = new GuiOutput();
        
        ReceiptFormatStrategy format = new ReceiptFormat();
        
        //////////////Transaction #1//////////////
        
        //add new receipt(create) need database here too
        posTerminal.createNewReceipt("001", dataAccess, outputOne, outputTwo);
        
        //add a line item (repeat as necessary foreach loop to cycle through
        //the array one time (productId and quantity are the params)
        //this is the modification reponsibility of the PosTerminal
        posTerminal.addLineItemToReceipt("10A", 1);
        posTerminal.addLineItemToReceipt("10B", 3);
        posTerminal.addLineItemToReceipt("10C", 1);
        posTerminal.addLineItemToReceipt("10D", 4);
        
        //display the GUI receipt
        posTerminal.closeoutReceipt(format);
        
        
        
         //////////////Transaction #2//////////////
        
        posTerminal.createNewReceipt("002", dataAccess, outputOne, outputTwo);
        
        //add a line item (repeat as necessary foreach loop to cycle through
        //the array one time (productId and quantity are the params)
        //this is the modification reponsibility of the PosTerminal
        posTerminal.addLineItemToReceipt("10E", 2);
        posTerminal.addLineItemToReceipt("10B", 1);
        posTerminal.addLineItemToReceipt("10D", 4);
        
        //display the GUI receipt
        posTerminal.closeoutReceipt(format);
        
        
    }
}
