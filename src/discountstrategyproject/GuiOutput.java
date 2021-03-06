package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class GuiOutput implements OutputStrategy {

    //when a custome exception class was applied here the amount of problems
    //multiplied
    
    @Override
    public final void display(String message){
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        } else {
        JOptionPane.showMessageDialog(null, message);
        }
    }
    
    
}
