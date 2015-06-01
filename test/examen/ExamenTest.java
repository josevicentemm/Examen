/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vesprada
 */
public class ExamenTest {
    
    public ExamenTest() {
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
     * Test of max3 method, of class Examen.
     */
    @Test
    public void testMax3() {
        System.out.println("max3");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int expResult = 3;
        int result = Examen.max3(num1, num2, num3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of max5 method, of class Examen.
     */
    @Test
    public void testMax5() {
        System.out.println("max5");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 6;
        int num5 = 4;
        int expResult = 6;
        int result = Examen.max5(num1, num2, num3, num4, num5);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of min5 method, of class Examen.
     */
    @Test
    public void testMin5() {
        System.out.println("min5");
        int num1 = 6;
        int num2 = 8;
        int num3 = 5;
        int num4 = 4;
        int num5 = 9;
        int expResult = 4;
        int result = Examen.min5(num1, num2, num3, num4, num5);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of potencia method, of class Examen.
     */
    @Test
    public void testPotencia() {
        System.out.println("potencia");
        int base = 2;
        int exponente = 2;
        int expResult = 4;
        int result = Examen.potencia(base, exponente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumacifras method, of class Examen.
     */
    @Test
    public void testSumacifras() {
        System.out.println("sumacifras");
        int num = 23;
        int expResult = 5;
        int result = Examen.sumacifras(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of numcifras method, of class Examen.
     */
    @Test
    public void testNumcifras() {
        System.out.println("numcifras");
        int num = 34;
        int expResult = 2;
        int result = Examen.numcifras(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Examen.
     */
   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Examen.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
}
