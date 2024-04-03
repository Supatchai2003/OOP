package poker;
import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void drawCard(Card card) {
        hand.add(card);
    }

    public void displayHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.displayCard();
        }
    }
}

