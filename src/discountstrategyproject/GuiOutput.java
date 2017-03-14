package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class GuiOutput implements OutputStrategy {

    @Override
    public final String displayReceipt() {
        //display to GUI. Currently this method is being written in the receipt
        //class. Think if that is necessary or if it belongs here
        return "";
    }

    @Override
    public final void display(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Value must not be null or empty.");
        } else {
        JOptionPane.showMessageDialog(null, message);
        }
    }
    
}
