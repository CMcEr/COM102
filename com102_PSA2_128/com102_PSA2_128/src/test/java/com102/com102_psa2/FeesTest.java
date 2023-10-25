
package com102.com102_psa2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Calum
 */
public class FeesTest {
    
    public FeesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcFees method, of class Fees.
     */
    @Test
    public void testCalcFees() 
    {
        System.out.println("calcFees");
        String sMode = "FT";
        int sYear = 2;
        int sModules = 6;
        Fees instance = new Fees("James Gunn", "05/02/2001", "Male", 
                "FT", 2, 6);;
        int expResult = 5000;
        int result = instance.calcFees(sMode, sYear, sModules);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
