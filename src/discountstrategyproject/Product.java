package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class Product {
    
    private DiscountStrategy discount;
    private String productId;
    private String productName;
    private double retailPrice;
    
    public Product (DiscountStrategy discount) {
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    
    
    
}
