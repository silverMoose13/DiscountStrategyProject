package discountstrategyproject;

/**
 *
 * @author agnas
 */
public class ReceiptFormat implements ReceiptFormatStrategy {
    
    LineItem lineItems = new LineItem();
    
    @Override
    public final String formatReceipt(Receipt receipt) {
        //use the appended string values instead. The other way does not work well
        
        StringBuilder buildReceipt = new StringBuilder("");
        buildReceipt.append("Thank you for shopping at Kohls! \n\n");
        buildReceipt.append("Sold to: ").append(receipt.getCustomer().getCustomerName()).append("\n");
        buildReceipt.append("Receipt No.: ").append(receipt.getReceiptId()).append("\n\n");
        buildReceipt.append("ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n");
        buildReceipt.append("---------------------------------------------------\n\n");
        
        //for loop to go through items in the transactions
        //receipt.getLineItem()
        
        buildReceipt.append("---------------------------------------------------\n\n");
        buildReceipt.append("\t\t\tNet Total: $").append(receipt.getNetTotal()).append("\n");
        buildReceipt.append("\t\t\tTotal Saved: $").append(receipt.getTotalSaved(lineItems.getProduct().getRetailPrice())).append("\n");;
        buildReceipt.append("\t\t\tTotal Due: $").append(receipt.getGrandTotal(lineItems.getProduct().getRetailPrice())).append("\n");;
        
        return buildReceipt.toString();
    }
    
    
//        receiptTemplate += "Thank you for shopping at Kohls \n";
//        receiptTemplate += "Sold to: pass in customer name here \n";
//        receiptTemplate += "Receipt No.: pass in receipt number here \n\n";
//        receiptTemplate += "ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n";
//        receiptTemplate += "------------------------------------------------------- \n";
//        receiptTemplate += "Line Item goes here";
//        //continue to add line items with a loop
//        receiptTemplate += "-------";
//        receiptTemplate += "Net Total: pass in calculate net total method here \n";
//        receiptTemplate += "Total Savings: pass in grandtotal - nettotal methods \n";
//        receiptTemplate += "Amount Due: pass in grand total method \n";
    
    
            //I performed it this way because I wanted to make use of the String formatter
        //later on
//        outputStrategy.display("Thank you for shopping at Kohls \n");
//        //this line will pass in the customer that is linked to the ID in the database
//        //remember that this will be null if no match is found so have a quality
//        //in the method that will allow for that
//        outputStrategy.display("Sold to: \n");
//        //create a receiptId that would increment here
//        outputStrategy.display("Receipt No.: \n\n");
//        outputStrategy.display("ID \tItem \tPrice \tQty \tSubtotal \tDiscount \n");
//        outputStrategy.display("------------------------------------------------------- \n");
//        //addItemToReceipt
//        outputStrategy.display("Line Item goes here");
//        outputStrategy.display("-------");
//        
//        //these three lines will make use of the formatter (f) so that the values can be 
//        //rounded to the nearest decimal place. Convert these later
//        outputStrategy.display("Net Total: \n");
//        outputStrategy.display("Total Savings: \n");
//        outputStrategy.display("Amount Due: \n");
    
}
