/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inies
 */
public class CalculadoraSimpleTest {
    
    public CalculadoraSimpleTest() {
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
     * Test of sumar method, of class CalculadoraSimple.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int n1 = 0;
        int n2 = 0;
        CalculadoraSimple instance = new CalculadoraSimple();
        int expResult = 0;
        int result = instance.sumar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class CalculadoraSimple.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int n1 = 0;
        int n2 = 0;
        CalculadoraSimple instance = new CalculadoraSimple();
        int expResult = 0;
        int result = instance.restar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class CalculadoraSimple.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 0;
        int n2 = 0;
        CalculadoraSimple instance = new CalculadoraSimple();
        int expResult = 0;
        int result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
