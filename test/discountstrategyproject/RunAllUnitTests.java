/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author agnas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({discountstrategyproject.CustomerTest.class, discountstrategyproject.ProductTest.class,
discountstrategyproject.FlatAmountDiscountTest.class})
public class RunAllUnitTests {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
