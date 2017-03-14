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
    
    public LineItem() {}

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        if (quantity <= 0 || quantity > 100) {
            throw new IllegalArgumentException("Value must not be less than or equal to 0."
                    + "It may also not be greater than 100.");
        }
        this.quantity = quantity;
    }
    
    public final void calculateSubTotal() {
        //calculate without discount applied
        //product price * quantity
    }
    
    
}
