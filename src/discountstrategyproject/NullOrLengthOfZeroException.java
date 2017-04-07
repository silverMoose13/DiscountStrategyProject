package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class NullOrLengthOfZeroException extends IllegalArgumentException {

    private static final String MESSAGE = "ID must not be null or have a "
                    + "length of 0 characters.";
    
    public NullOrLengthOfZeroException() {
        super(MESSAGE);
    }

    public NullOrLengthOfZeroException(String message) {
        super(MESSAGE);
    }

    public NullOrLengthOfZeroException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public NullOrLengthOfZeroException(Throwable cause) {
        super(cause);
    }
    
}
