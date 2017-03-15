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
public class PercentageDiscount implements DiscountStrategy{
    
    private double percentageOff;

    public PercentageDiscount(double percentOff){
        //create constructor
    }
    @Override
    public final void calculateDiscountAmount(int qty, double price) {
        //retailPrice * quantity * percentOff
    }
    
}
