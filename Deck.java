import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private List<Card> cards;

    public Deck() {
        // Initialize the deck with all 52 cards
        cards = new ArrayList<Card>();
        for (int i = 2; i <= 14; i++) {
            cards.add(new Card(i, "Clubs"));
            cards.add(new Card(i, "Diamonds"));
            cards.add(new Card(i, "Hearts"));
            cards.add(new Card(i, "Spades"));
        }
    }

    
     //Shuffle the cards in the deck randomly
     
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Remove and return the top card from the deck
     * @return the top card of the deck
     */
    public Card draw() {
        return cards.remove(0);
    }
}
