/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author Aaron
 */
public class InvalidMinimumQuantityAmountException extends IllegalArgumentException {

    public static final String MESSAGE = "Quantity needs to be at least 1.";
    
    public InvalidMinimumQuantityAmountException() {
        super(MESSAGE);
    }

    public InvalidMinimumQuantityAmountException(String message) {
        super(MESSAGE);
    }

    public InvalidMinimumQuantityAmountException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public InvalidMinimumQuantityAmountException(Throwable cause) {
        super(cause);
    }
    
}
