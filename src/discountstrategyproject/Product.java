package discountstrategyproject;

/**
 *
 * @author Aaron
 */
//the responsibility of this class is to set and retrieve product information
public class Product {

    private DiscountStrategy discount;
    private String productId;
    private String productName;
    private double retailPrice;

    public Product(String productId, String productName, double retailPrice, DiscountStrategy discount) {
        this.productId = productId;
        this.productName = productName;
        this.retailPrice = retailPrice;
        this.discount = discount;
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) throws NullOrEmptyException {
        if (productId == null || productId.length() == 0) {
            throw new NullOrEmptyException();
        }
        this.productId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) throws NullOrEmptyException{
        if (productName == null || productName.isEmpty()) {
            throw new NullOrEmptyException();
        }
        this.productName = productName;
    }

    public final double getRetailPrice() {
        return retailPrice;
    }

    //upper bound set to a realistic amount for Kohl's
    public final void setRetailPrice(double retailPrice) throws NumberOutOfRangeException {
        if (retailPrice <= 0 || retailPrice > 25000) {
            throw new NumberOutOfRangeException();
        }
        this.retailPrice = retailPrice;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discount;
    }

    public final double getDiscountAmount(int quantity) throws InvalidMinimumQuantityAmountException, 
            NumberOutOfRangeException{
        if (quantity < 1) {
            throw new InvalidMinimumQuantityAmountException();
        }
        return getDiscountStrategy().getDiscountAmount(quantity, getRetailPrice());
    }

}
