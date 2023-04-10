public class App {
    public static void main(String[] args) {
        // Instantiate a deck and two players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();

        // Draw cards for each player
        for (int i = 0; i < 52; i++) {
            // Alternate drawing cards for each player
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Flip cards for each player and increment score for the higher card
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

            // Print the flipped cards for each player
            System.out.println("Player 1 flips: " + player1Card.describe());
            System.out.println("Player 2 flips: " + player2Card.describe());

            // Compare the flipped cards and increment the score for the winner
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins!");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("Draw!");
            }

            // Print the updated scores for each player
            System.out.println("Player 1 score: " + player1.getScore());
            System.out.println("Player 2 score: " + player2.getScore());
        }

        // Determine the winner based on the final scores
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins with a score of " + player1.getScore());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins with a score of " + player2.getScore());
        } else {
            System.out.println("It's a tie with a score of " + player1.getScore());
        }
    }
}
