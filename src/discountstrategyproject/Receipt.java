package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class Receipt {
    
    //do we want output strategy in here?
    private OutputStrategy outputStrategy;
    private Customer customer;
    private LineItem[] lineItem;
    private String receiptId;
    
    public Receipt(OutputStrategy outputStrategy, Customer customer, LineItem[] lineItem) {
        this.outputStrategy = outputStrategy;
        this.customer = customer;
        this.lineItem = lineItem;
    }
    
    public final String getReceiptId() {
        return receiptId;
    }
    
    public final void setReceiptId(String receiptId) {
        //need validation
        this.receiptId = receiptId;
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
    
    public final String displayReceipt() {
        String receipt = "";
        
        //append a bunch of strings together and line break them
        //using the string formatter f
        //+= Thank you for shopping at Kohls \n
        //+= Sold to: Sally Jones \n
        //+= Receipt No.: \n\n
        //+= ID Item Price Qty Subtotal Discount \n
        //+= ----------------------------------- \n
        //+= line item
        //+= line item
        //+= as needed... \n\n
        //+= -------
        //+= Total Excluding Discount \n
        //+= Total Savings \n
        //+= Total Amount Due \n
        
        return receipt;
    }
    
    
    
    
}
