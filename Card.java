public class Card {
    // Enum to define the four possible suits for a card
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    private int value; // The value of the card (2-10, Jack, Queen, King, Ace)
    private Suit suit; // The suit of the card (CLUBS, DIAMONDS, HEARTS, SPADES)
    private String name; // The name of the card (e.g. "Ace of Hearts")

    public Card(int value, String suit) {
        // Constructor for the Card class
        this.value = value;
        // Convert the suit string to a Suit enum using the valueOf() method
        this.suit = Suit.valueOf(suit.toUpperCase());
        setName(); // Call the setName() method to set the name of the card
    }

    public int getValue() {
        // Getter method for the value of the card
        return value;
    }

    public void setValue(int value) {
        // Setter method for the value of the card
        this.value = value;
    }

    public String getName() {
        // Getter method for the name of the card
        return name;
    }

    public void setName() {
        // Method to set the name of the card based on its value and suit
        String valStr;
        switch (value) {
            case 11:
                valStr = "Jack";
                break;
            case 12:
                valStr = "Queen";
                break;
            case 13:
                valStr = "King";
                break;
            case 14:
                valStr = "Ace";
                break;
            default:
                valStr = String.valueOf(value);
        }
        // Set the name of the card by combining the value and suit
        this.name = valStr + " of " + suit.toString();
    }

    public String describe() {
        // Method to return the name of the card
        return name;
    }
}
