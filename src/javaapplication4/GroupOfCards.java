
package javaapplication4;

/**
 *
 * @author rudra
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<playingCard> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int givenSize) {
        size = givenSize;
        cards = new ArrayList<playingCard>();
      
        for (playingCard.Suit s : playingCard.Suit.values()) {
            
            for (playingCard.Value v : playingCard.Value.values()) {
                
                cards.add(new playingCard(s, v));
//                System.out.println(cards);
                
            }
        }

    }

   
    // group of cards as an ArrayList
    
    public ArrayList<playingCard> showCards() {
        return cards;
    }

    public void shuffle() {
        Random random = new Random();
        playingCard temp;
        for (int i = 0; i < 200; i++) {
            int index1 = random.nextInt(cards.size() - 1);
            int index2 = random.nextInt(cards.size() - 1);
            temp = cards.get(index2);
            cards.set(index2, cards.get(index1));
            cards.set(index1, temp);
        }
    }

    
    public int getSize() {
        if(cards.size()<=0){
            return 0;
        }
        return size;
    }

    
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public playingCard drawCard() {
        if(cards.size()<=0){
            return null;
        }
        playingCard card = cards.remove(0);
        size--;
        return card;
    }

    public ArrayList<playingCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<playingCard> cards) {
        this.cards = cards;
    }
}

//end class
