/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agnas
 */
public class CustomerTest {

    private Customer customer;

    public CustomerTest() {
    }

    @Before
    public void setUp() {
        customer = new Customer();
    }

    @After
    public void tearDown() {
    }

    //testing the bad here
    /**
     * Test of setCustomerName method, of class Customer.
     */
    @Test(expected = NullOrLengthOfZeroException.class)
    public void setCustomerNameShouldNotBeNull() {
        customer.setCustomerName(null);
    }

    @Test(expected = NullOrLengthOfZeroException.class)
    public void setCustomerNameShouldNotHaveALengthOfZero() {
        customer.setCustomerName("");
    }

    //testing the good here
    @Test
    public void setCustomerNameShouldAllowALengthOfAtLeastOne() {
        String[] validCustomerName = {
            "Bob Jones", "Sherry Wilson", "Tom McCormack"
        };
        
        try {
            for (int index = 0; index < validCustomerName.length; index++) {
                customer.setCustomerName(validCustomerName[index]);
            }
        } catch(NullOrLengthOfZeroException e) {
            fail("Test failed because the customer name did not have at least a length of 1.");
        }

    }

}

//expected is only used when you are testing a numeric result

//if it returns anything other than void you must test what you are getting what you expect

//in a validation strategy object try to compact duplicate if logic that keeps being used over and over again