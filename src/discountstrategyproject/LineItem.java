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
        //replace with the setter here?
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        //need validation
        this.quantity = quantity;
    }
    
    public void calculateSubTotal() {
        //calculate without discount applied
        //product price * quantity
    }
    
    
}
