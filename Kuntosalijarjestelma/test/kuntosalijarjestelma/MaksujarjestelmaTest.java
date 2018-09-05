/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuntosalijarjestelma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juho Suni
 */
public class MaksujarjestelmaTest {
    
    public MaksujarjestelmaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of annaTulot method, of class Maksujarjestelma.
     */
    @Test
    public void testAnnaTulot() {
        System.out.println("annaTulot");
        Maksujarjestelma instance = new Maksujarjestelma();
        int expResult = 0;
        int result = instance.annaTulot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of annaMenot method, of class Maksujarjestelma.
     */
    @Test
    public void testAnnaMenot() {
        System.out.println("annaMenot");
        Maksujarjestelma instance = new Maksujarjestelma();
        int expResult = 0;
        int result = instance.annaMenot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
