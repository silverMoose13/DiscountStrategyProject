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

//getting the customer and product information and how it is obtained
//can vary. This example only has one way of retrieving data (in memory)
public interface ReceiptDataAccessStrategy {
    
    public abstract Customer getCustomerInformation(final String customerId);
    public abstract Product getProductInformation(final String productId);
    
}
