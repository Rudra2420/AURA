/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author rudra
 */
import java.util.ArrayList;

public abstract class Player {

    
    ArrayList<Hand> hand;

    Player() {
        hand = new ArrayList<Hand>();
    }

    public boolean hasBlackJack(int handnum) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return (aHand[handnum - 1].getHandSize() == 2 && aHand[handnum - 1].getHandValue() == 21);
    }

    public boolean hasBusted() {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return (aHand[0].getHandValue() >= 22);
    }

    public Hand getHand(int handnum) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return aHand[handnum - 1];
    }

    public void getNewHand(GroupOfCards deck) {
        hand.clear();
        Hand myHand = new Hand(deck);
        hand.add(myHand);
    }
    
}
