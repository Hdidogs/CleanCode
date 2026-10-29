package card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    public static final int INT_MAX_CARD_BY_HAND = 5;
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public Hand addCard(Card card) {
        if (cards.size() < INT_MAX_CARD_BY_HAND) cards.add(card);

        return this;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getHigherValue() {
        int res = 0;

        for (Card card : getCards()) {
            if (card.getValue() > res) res = card.getValue();
        }

        return res;
    }
}
