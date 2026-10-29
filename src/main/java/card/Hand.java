package card;

import java.util.List;

public class Hand {
    public static final int INT_MAX_CARD_BY_HAND = 5;
    private List<Card> cards;

    public Hand() {
    }

    public Hand addCard(Card card) {
        if (cards.size() < INT_MAX_CARD_BY_HAND) cards.add(card);

        return this;
    }
}
