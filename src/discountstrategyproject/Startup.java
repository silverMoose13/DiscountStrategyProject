package discountstrategyproject;

/**
 *
 * @author agnas
 */
public class Startup {
    public static void main(String[] args) {
        
        //think about what this class needs to do in order
        //to simulate the program
        /////////////////////////////////////////////////
        PointOfSaleTerminal posTerminal = new PointOfSaleTerminal();
        ReceiptDataAccessStrategy dataAccess = new InMemoryDataAccess();
        
        OutputStrategy outputOne = new ConsoleOutput();
        OutputStrategy outputTwo = new GuiOutput();
        
        //add new receipt(create) need database here too
        posTerminal.createNewReceipt("001", dataAccess);
     
        //display a few prelim lines (welcome to kohls) (method will be in receipt)
        
        
        //display a line item (repeat as necessary foreach loop to cycle through
        //the array one time
        
        
        //display the GUI receipt
        //outputTwo
        
        //display the Console receipt
        //outputOne
        
        //repeat this process again (since there are two receipts as needed
        //by the spec
        
        
    }
}
