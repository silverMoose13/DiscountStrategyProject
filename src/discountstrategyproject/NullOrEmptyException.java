package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NullOrEmptyException extends IllegalArgumentException {

    private static final String MESSAGE = "Error! Value must not be null or empty.";
    
    public NullOrEmptyException() {
        super(MESSAGE);
    }

    public NullOrEmptyException(String message) {
        super(message);
    }

    public NullOrEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullOrEmptyException(Throwable cause) {
        super(cause);
    }
    
}
