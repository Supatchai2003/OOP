package poker;

public class Game {
    public static void main(String[] args) {
        Deck deck = new DeckImpl();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // แจกไพ่ให้ผู้เล่น
        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck.dealCard());
            player2.drawCard(deck.dealCard());
        }

        // แสดงไพ่ที่ผู้เล่นถือ
        player1.displayHand();
        player2.displayHand();
    }
}

