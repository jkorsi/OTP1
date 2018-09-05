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
public class MaksuTapahtumaListaTest {
    
    public MaksuTapahtumaListaTest() {
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
     * Test of luoTapahtuma method, of class MaksuTapahtumaLista.
     */
    @Test
    public void testLuoTapahtuma() {
        System.out.println("luoTapahtuma");
        MaksuTapahtumaLista instance = new MaksuTapahtumaLista();
        instance.luoTapahtuma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haeTapathuma method, of class MaksuTapahtumaLista.
     */
    @Test
    public void testHaeTapathuma() {
        System.out.println("haeTapathuma");
        MaksuTapahtumaLista instance = new MaksuTapahtumaLista();
        MaksuTapahtumaItem expResult = null;
        MaksuTapahtumaItem result = instance.haeTapathuma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
