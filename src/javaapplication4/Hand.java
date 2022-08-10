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
import java.util.Arrays;

public class Hand {

    private ArrayList<playingCard> hand;
    private int handValue;
    private int aceCounter;

    Hand(GroupOfCards deck) {
        hand = new ArrayList<>();
        aceCounter = 0;
        handValue = 0;
        for (int i = 0; i < 2; i++) {
            hand.add(deck.drawCard());
        }
        for (playingCard card : hand) {
            handValue += card.getValue();
            if (card.getValue() == 11) {
                aceCounter++;
            }
            while (aceCounter > 0 && handValue >= 22) {
                handValue -= 10;
                aceCounter--;
            }
        }
    }

    public void Hit(GroupOfCards deck) {
        hand.add((playingCard) deck.drawCard());
        playingCard[] aHand = new playingCard[]{};
        aHand = hand.toArray(aHand);
        handValue = 0;
        aceCounter = 0;
        for (int i = 0; i < aHand.length; i++) {
            handValue = handValue + aHand[i].getValue();
            if (aHand[i].getValue() == 11) {
                aceCounter++;
            }
            while (aceCounter > 0 && handValue >= 22) {
                handValue = handValue - 10;
                aceCounter--;
            }
        }
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getHandValue() {
        return handValue;
    }

    public playingCard getCard(int cardnum) {
        return hand.get(cardnum);
    }

    public String toString() {
        String hands = "";
        Card[] aHand = new Card[]{};
        aHand = hand.toArray(aHand);
        for (int i = 0; i < aHand.length - 1; i++) {
            hands = hands + aHand[i].toString() + ", ";
        }
        hands = hands + aHand[aHand.length - 1].toString();
        return hands;
    }

    public ArrayList<playingCard> getHand() {
        return hand;
    }

    public void setHand(ArrayList<playingCard> hand) {
        this.hand = hand;
    }
}
