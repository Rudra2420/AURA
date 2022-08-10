/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication4;

import java.util.ArrayList;
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
public class HandTest {
    
    public HandTest() {
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
     * Test of Hit method, of class Hand.
     */
    @Test
    public void testHit() {
        System.out.println("Hit");
        GroupOfCards deck = null;
        Hand instance = null;
        instance.Hit(deck);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHandSize method, of class Hand.
     */
    @Test
    public void testGetHandSize() {
        System.out.println("getHandSize");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getHandSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHandValue method, of class Hand.
     */
    @Test
    public void testGetHandValue() {
        System.out.println("getHandValue");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Hand.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int cardnum = 0;
        Hand instance = null;
        playingCard expResult = null;
        playingCard result = instance.getCard(cardnum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Hand.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Hand instance = null;
        ArrayList<playingCard> expResult = null;
        ArrayList<playingCard> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class Hand.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        ArrayList<playingCard> hand = null;
        Hand instance = null;
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
