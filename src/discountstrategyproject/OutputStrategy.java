package discountstrategyproject;

/**
 *
 * @author Aaron
 */

//pure abstract interface class for output 

public interface OutputStrategy {
    
    //when a custom Exception was applied to this abstract method problems started occurring
    //and the try catch statements imported by NetBeans didn't make sense
    public abstract void display(String message);
}
