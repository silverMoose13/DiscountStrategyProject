package discountstrategyproject;

/**
 *
 * @author agnas
 */
public class Startup {
    public static void main(String[] args) {
        
        PointOfSaleTerminal posTerminal = new PointOfSaleTerminal();
        ReceiptDataAccessStrategy dataAccess = new InMemoryDataAccess();
        
        OutputStrategy outputOne = new ConsoleOutput();
        OutputStrategy outputTwo = new GuiOutput();
        
        //add new receipt(create) need database here too
        posTerminal.createNewReceipt("001", dataAccess);
        
        //add a line item (repeat as necessary foreach loop to cycle through
        //the array one time (productId and quantity are the params
        //posTerminal.addLineItemToReceipt("10A", 1)
        
        //display the GUI receipt
        //outputTwo
        
        //display the Console receipt
        //outputOne
        
        //repeat this process again (since there are two receipts as needed
        //by the spec
        
        
    }
}
