package discountstrategyproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class FlatAmountDiscountTest {

    private FlatAmountDiscount discount;

    public FlatAmountDiscountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        discount = new FlatAmountDiscount();
    }

    @After
    public void tearDown() {
    }

    //////////
    //the bad
    //////////
    /**
     * Test of setFlatAmountOff method, of class FlatAmountDiscount.
     */
    @Test
    public void testSetFlatAmountOffShouldNotBeEqualToOrLessThanZeroAndAlsoNotGreaterThanTwoThousand() {
        double[] invalidFlatAmountOff = {
            -0.01, 0.00, 2000.01
        };

        //the try needs to go inside the for loop
        try {
            for (int index = 0; index < invalidFlatAmountOff.length; index++) {
                discount.setFlatAmountOff(invalidFlatAmountOff[index]);
                //don't forget to add the fail here
                fail("The test failed.");
            }
        } catch (NumberOutOfRangeException e) {
            // success
        }
    }

    /**
     * Test of getDiscountAmount method, of class FlatAmountDiscount.
     */
    @Test
    public void testGetDiscountAmountShouldNotHaveARetailPriceGreaterThanTwentyFiveThousand() {
        //picked a valid number for quantity
        //we are testing for invalidRetailPrices here
        //so that's where the focus should be
        int quantity = 3;

        double[] invalidRetailPrice = {
            25000.01, 800000.00, 25001.00
        };

        try {
            for (int index = 0; index < invalidRetailPrice.length; index++) {
                discount.getDiscountAmount(quantity, invalidRetailPrice[index]);
            }
        } catch (NumberOutOfRangeException e) {
            // success
        }
    }

    @Test
    public void testGetDiscountAmountShouldNotHaveAQuantityLessThanOne() {
        int invalidQuantity = -2;
        double retailPrice = 10000;

        try {
            discount.getDiscountAmount(invalidQuantity, retailPrice);
        } catch (InvalidMinimumQuantityAmountException e) {
            // success
        }
    }

    /////////
    ////the good
    //////////
    @Test
    public void testFlatAmountOffShouldHaveValueGreaterThanZeroAndLessThanOrEqualToTwoThousand() {
        try {
        discount.setFlatAmountOff(1000);
        } catch (NumberOutOfRangeException e) {
            fail("Test failed because the retail price did not have a value within"
                    + "the proper range of > 0.00 and <= 25000.00.");
        }
    }

    @Test
    public void testGetDiscountAmountShoulHaveAQuantityOfAtLeastOne() {
        int validQuantity = 1;
        double retailPrice = 10000;

        try {
            discount.getDiscountAmount(validQuantity, retailPrice);
        } catch (InvalidMinimumQuantityAmountException e) {
            fail("Test failed because the quantity did not have a value of at least 1.");
        }
    }
    
        @Test
    public void testGetDiscountAmountShouldHaveARetailPriceLessThanOrEqualToTwentyFiveThousandAndGreaterThanZero() {
        int validQuantity = 3;
        double retailPrice = 10000;

        try {
            discount.getDiscountAmount(validQuantity, retailPrice);
        } catch (NumberOutOfRangeException e) {
            fail("Test failed because the retail price did not have a value within"
                    + "the proper range of > 0.00 and <= 25000.00.");
        }
    }
}

//////////////////////////////////
////////Notes from Code Review////
//////////////////////////////////

//make sure you include assertEqual methods to compare the output vs an expected value (currently
//all that was being tested was valid input values and output is super important to test)
//example: flatAmount off expected should equal flatAmount actual
//assertEquals(expected, actual, (here you need error range for numbers if the datatypes aren't the same, ex: 0.001)

//ensure you have a fail("message here")
//try catch should be inside the for loop otherwise the statements will never be reached
