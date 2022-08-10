/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rudra
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of hasBlackJack method, of class Player.
     */
    @Test
    public void testHasBlackJack() {
        System.out.println("hasBlackJack");
        int handnum = 0;
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.hasBlackJack(handnum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasBusted method, of class Player.
     */
    @Test
    public void testHasBusted() {
        System.out.println("hasBusted");
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.hasBusted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        int handnum = 0;
        Player instance = new PlayerImpl();
        Hand expResult = null;
        Hand result = instance.getHand(handnum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewHand method, of class Player.
     */
    @Test
    public void testGetNewHand() {
        System.out.println("getNewHand");
        GroupOfCards deck = null;
        Player instance = new PlayerImpl();
        instance.getNewHand(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {
    }
    
}
