package javaapplication4;


/**
 *
 * @author rudra
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Dealer extends Player {

    public Dealer() {
        super();
    }

    public void showFirstCard() {
        System.out.println("[" + this.hand.get(0).getHand().get(0) + "]");
    }

    public boolean wantsToHit() {
        Hand[] aHand = new Hand[]{};
        if(hand.size() > 0) {
            aHand = hand.toArray(aHand);
            return aHand[0].getHandValue() < 21;
        } else {
            return false;
        }
    }

    public void showHand() {
        System.out.println(hand);
    }

    public String takeTurn(GroupOfCards deck) {
        Hand[] aHand = new Hand[]{};
        String result = null;
        aHand = hand.toArray(aHand);
        while (wantsToHit()) {
            result = "The dealer hits.";
            System.out.println(result);
            aHand[0].Hit(deck);
            if (hasBusted()) {
                break;
            }
        }
        if(aHand.length <= 0) {
            return "Please initialise hand!";
        }
        else{
            result = "The dealer stands.";
        }
        return result;
    }
}

