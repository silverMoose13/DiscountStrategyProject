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
public class ProductTest {

    private Product product;

    public ProductTest() {
    }

    @Before
    public void setUp() {
        product = new Product();
    }

    @After
    public void tearDown() {
    }

    ///////////
    //the bad
    ///////////
    /**
     * Test of setProductId method, of class Product.
     */
    @Test(expected = NullOrLengthOfZeroException.class)
    public void setProductIdShouldNotBeNull() {
        product.setProductId(null);
    }

    @Test(expected = NullOrLengthOfZeroException.class)
    public void setProductIdShouldNotHaveALengthOfZero() {
        product.setProductId("");
    }

    /**
     * Test of setProductName method, of class Product.
     */
    @Test(expected = NullOrEmptyException.class)
    public void setProductNameShouldNotBeNull() {
        product.setProductName(null);
    }

    @Test(expected = NullOrEmptyException.class)
    public void setProductNameShouldNotBeEmpty() {
        product.setProductName("");
    }

    /**
     * Test of setRetailPrice method, of class Product.
     */
    @Test
    public void setRetailPriceShouldNotBeLessThanOrEqualToZero() {
        double[] invalidRetailPrice = {
            -0.01, 0.00, -5000.00
        };

        try {
            for (int index = 0; index < invalidRetailPrice.length; index++) {
                product.setRetailPrice(invalidRetailPrice[index]);
            }
        } catch (NumberOutOfRangeException e) {
            // success
        }
    }

    //there is more than 1 value being tested so use try catch instead of expected
    @Test
    public void setRetailPriceShouldNotBeGreaterThanTwentyFiveThousand() {
        double[] invalidRetailPrice = {
            25000.01, 800000.00, 25001.00
        };

        try {
            for (int index = 0; index < invalidRetailPrice.length; index++) {
                product.setRetailPrice(invalidRetailPrice[index]);
            }
        } catch (NumberOutOfRangeException e) {
            // success
        }
    }

    ///////////
    //the good
    ///////////
    @Test
    public void setProductIdShouldAllowALengthOfAtLeastOne() {
        String[] validProductId = {
            "0012ASd", "HGS342", "101223", "HHSGEFU", "hhdgGGFe"
        };

        try {
            for (int index = 0; index < validProductId.length; index++) {
                product.setProductId(validProductId[index]);
            }
        } catch (NullOrLengthOfZeroException e) {
            fail("Test failed because the product ID did not have at least a length of 1.");
        }

    }

    //since this is a range here, I should probably make this test to have the
    //proper range
    @Test
    public void setRetailPriceShouldBeGreaterThanZeroAndLessThanOrEqualToTwentyFiveThousand() {
        double[] validRetailPrice = {
            25000.00, 0.01, 24999.99
        };

        try {
            for (int index = 0; index < validRetailPrice.length; index++) {
                product.setRetailPrice(validRetailPrice[index]);
            }
        } catch (NumberOutOfRangeException e) {
            fail("Test failed because the retail price was >= 0 or > 25000.");
        }
    }

    @Test
    public void setProductNameShouldAllowALengthOfAtLeastOne() {
        String[] validProductId = {
            "Men's T-shirt", "Leather Wallet", "Women's Running Shoes"
        };

        try {
            for (int index = 0; index < validProductId.length; index++) {
                product.setProductId(validProductId[index]);
            }
        } catch (NullOrLengthOfZeroException e) {
            fail("Test failed because the product name did not have at least a length of 1.");
        }

    }

}
