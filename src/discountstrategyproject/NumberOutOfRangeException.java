package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NumberOutOfRangeException extends Exception {

    private static final String MESSAGE = "Retail price must not be less than or equal to $0.00. It"
                    + "may also not be greater than $25,000.00";
    
    public NumberOutOfRangeException() {
        super(MESSAGE);
    }

    public NumberOutOfRangeException(String message) {
        super(message);
    }

    public NumberOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberOutOfRangeException(Throwable cause) {
        super(cause);
    }
    
}
