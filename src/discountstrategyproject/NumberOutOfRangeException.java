package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NumberOutOfRangeException extends IllegalArgumentException {

    private static final String MESSAGE = "Value is out of the permitted range of numbers.";
    
    public NumberOutOfRangeException() {
        super(MESSAGE);
    }

    public NumberOutOfRangeException(String message) {
        super(MESSAGE);
    }

    public NumberOutOfRangeException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public NumberOutOfRangeException(Throwable cause) {
        super(cause);
    }
    
}
