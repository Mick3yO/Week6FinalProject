import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand; // list to store the player's cards
    private int score; // player's score
    private String name; // player's name

    public Player(String name) {
        this.hand = new ArrayList<Card>(); // initialize the player's hand
        this.score = 0; // initialize the player's score to zero
        this.name = name; // set the player's name
    }

    // prints out the player's hand and score
    public void describe() {
        System.out.printf("%s's hand:\n", name);
        for (Card card : hand) {
            System.out.println(card.describe());
        }
        System.out.printf("%s's score: %d\n", name, score);
    }

    // removes and returns the top card of the player's hand
    public Card flip() {
        return hand.remove(0);
    }

    // takes a deck as an argument, draws a card and adds it to the player's hand
    public void draw(Deck deck) {
        Card card = deck.draw();
        hand.add(card);
        System.out.printf("%s drew %s.\n", name, card.describe());
    }

    // increments the player's score by 1
    public void incrementScore() {
        score++;
    }

    // returns the player's score
    public int getScore() {
        return score;
    }

    // returns the player's name
    public String getName() {
        return name;
    }
}
