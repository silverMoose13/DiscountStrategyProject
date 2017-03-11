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
public class FlatAmountDiscount implements DiscountStrategy{

        //not sure if this is the method we want to go about this
    private String discountType;

    public final String getDiscountType() {
        return discountType;
    }

    public final void setDiscountType(String discountType) {
        this.discountType = discountType;
    }
    
    @Override
    public final void calculateDiscountAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
