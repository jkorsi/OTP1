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
public class KulunvalvontajarjestelmaTest {
    
    public KulunvalvontajarjestelmaTest() {
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
     * Test of onkoJasenyysVoimassa method, of class Kulunvalvontajarjestelma.
     */
    @Test
    public void testOnkoJasenyysVoimassa() {
        System.out.println("onkoJasenyysVoimassa");
        Kulunvalvontajarjestelma instance = new Kulunvalvontajarjestelma();
        boolean expResult = false;
        boolean result = instance.onkoJasenyysVoimassa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avaaOvenLukitus method, of class Kulunvalvontajarjestelma.
     */
    @Test
    public void testAvaaOvenLukitus() {
        System.out.println("avaaOvenLukitus");
        boolean jasenyydenTila = false;
        Kulunvalvontajarjestelma instance = new Kulunvalvontajarjestelma();
        instance.avaaOvenLukitus(jasenyydenTila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
