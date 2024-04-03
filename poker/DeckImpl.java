package poker;

import java.util.ArrayList;
import java.util.Collections;

public class DeckImpl implements Deck {
    private ArrayList<Card> cards;

    public DeckImpl() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new PokerCard(suit, value));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card dealCard() {
        return cards.remove(0);
    }
}

