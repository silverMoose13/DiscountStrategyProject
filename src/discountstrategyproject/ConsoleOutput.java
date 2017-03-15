package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class ConsoleOutput implements OutputStrategy {

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
