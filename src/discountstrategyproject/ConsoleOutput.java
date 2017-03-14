package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class ConsoleOutput implements OutputStrategy {

    @Override
    public final String displayReceipt() {
        //Display to Console. This method is currently in the receipt and needs to be 
        //here instead
        return "";
    }

    @Override
    public final void display(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        }
        else {
        System.out.println(message + "\n");
        }
    }
    
}
