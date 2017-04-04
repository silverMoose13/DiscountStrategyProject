package discountstrategyproject;

/**
 *
 * @author Aaron
 */
//the responsibility of this class is to assemble the data needed to fill in the line item
//the information needed is as follows for an example:
//ID    Item                  Price    Qty    Subtotal    Discount
//------------------------------------------------------------------------
//C222    Women's Socks        $9.50    4     $38.00        $0.00
//productId     (obtained from product)
//productName   (obtained from product)
//retailPrice   (obtained from product)
//quantity      (gathered in this class)
//subtotal      (calculated in this class)
//discount      (called through the product class)
public class LineItem {

    private Product product;
    private int quantity;
    private ReceiptDataAccessStrategy dataAccess;

    public LineItem(String productId, int quantity, ReceiptDataAccessStrategy dataAccess) {
        product = findProduct(productId, dataAccess);
        this.quantity = quantity;
    }

    public LineItem() {
    }

    public Product getProduct() {
        return product;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) throws InvalidMinimumQuantityAmountException {
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        this.quantity = quantity;
    }

    //in order to gather information needed for the lineItem, 
    //we need to first find the product from the database
    private final Product findProduct(String productId, ReceiptDataAccessStrategy dataAccess) {
        return dataAccess.findProduct(productId, dataAccess);
    }

    //improve this method in terms of formatting
    public final String getLineItemInformation() throws InvalidMinimumQuantityAmountException, 
            NumberOutOfRangeException {
        //this will return the line of information. You can
        //append a string here and call in the methods needed
        String lineItemInformation = "";
        lineItemInformation += product.getProductId() + "  ";
        lineItemInformation += product.getProductName() + "  ";
        lineItemInformation += product.getRetailPrice() + "  ";
        lineItemInformation += quantity + "  ";
        lineItemInformation += getSubTotal() + "  ";
        lineItemInformation += product.getDiscountAmount(quantity);

        return lineItemInformation;
    }

    public final void addNewLineItem(String productId, int quantity) throws NullOrLengthOfZeroException,
            InvalidMinimumQuantityAmountException {
        if (productId == null || productId.length() == 0) {
            throw new NullOrLengthOfZeroException();
        }
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        findProduct(productId, dataAccess);
    }

    public final double getSubTotal() {
        return product.getRetailPrice() * quantity;
    }

    public final double getDiscountAmount(double retailPrice) throws NumberOutOfRangeException,
            InvalidMinimumQuantityAmountException {
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new NumberOutOfRangeException();
        }
        return product.getDiscountStrategy().getDiscountAmount(quantity, retailPrice);
    }
}
