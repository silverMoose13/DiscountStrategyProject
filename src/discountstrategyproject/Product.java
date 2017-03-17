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
    
    public Product (String productId, String productName, double retailPrice, DiscountStrategy discount) {
        this.discount = discount;
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product ID must not be null or empty.");
        } else {
        this.productId = productId;
        }
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name must not be null or empty.");
        } else {
        this.productName = productName;
        }
    }

    public final double getRetailPrice() {
        return retailPrice;
    }

    public final void setRetailPrice(double retailPrice) {
        if (retailPrice <= 0) {
            throw new IllegalArgumentException("Retail price must not be less than or equal to $0.00.");
        } else {
        this.retailPrice = retailPrice;
        }
    }
    
    
    
}
