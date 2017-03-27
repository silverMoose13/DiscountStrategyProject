package discountstrategyproject;

/**
 *
 * @author agnas
 */

//the purpose of this interface strategy is to create an abstract method that will 
//be used for formatting the receipt
public interface ReceiptFormatStrategy {
    
    public abstract String formatReceipt(Receipt receipt);
}
