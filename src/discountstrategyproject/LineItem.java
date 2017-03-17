package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class LineItem {
    
    private Product product;
    private int quantity;
    
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public LineItem() {}

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Value must not be less than or equal to 0.");
        }
        this.quantity = quantity;
    }
    
    public final void calculateSubTotal() {
        //calculate without discount applied
        //product price * quantity
        
    }
    
    public final void calculateNetTotal() {
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
    
}
