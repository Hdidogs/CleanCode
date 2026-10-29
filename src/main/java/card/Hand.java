package card;

import java.util.*;

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
        sort();

        return cards;
    }

    private void sort() {
        cards.sort(Comparator.comparingInt(Card::getValue));
    }

    public boolean hasBrelan() {
        return hasNumberOfvalue(3);
    }

    public boolean hasCarre() {
        return hasNumberOfvalue(4);
    }

    public boolean hasSuite() {
        List<Card> cardList = getCards();

        int previousVal = cardList.getFirst().getValue();
        cardList.remove(cardList.getFirst());

        for (Card card : cardList) {
            if (previousVal >= card.getValue()) return false;
            previousVal++;
            if (previousVal != card.getValue()) return false;
        }

        return true;
    }

    public boolean hasQuinteFlush() {
        return hasCouleur() && hasSuite();
    }

    public boolean hasCouleur() {
        Map<CardType, Integer> possibilities = new HashMap<>();

        for (Card card : getCards()) {
            if (possibilities.containsKey(card.getType())) possibilities.put(card.getType(), possibilities.get(card.getType()) + 1);
            else possibilities.put(card.getType(), 1);
        }

        for (Integer numberOf : possibilities.values()) {
            if (numberOf >= 5) return true;
        }

        return false;
    }

    public int getHigherValue() {
        int res = 0;

        for (Card card : getCards()) {
            if (card.getValue() > res) res = card.getValue();
        }

        return res;
    }

    private boolean hasNumberOfvalue(int target) {
        Map<Integer, Integer> possibilities = new HashMap<>();

        for (Card card : getCards()) {
            if (possibilities.containsKey(card.getValue())) possibilities.put(card.getValue(), possibilities.get(card.getValue()) + 1);
            else possibilities.put(card.getValue(), 1);
        }

        for (Integer numberOf : possibilities.values()) {
            if (numberOf >= target) return true;
        }

        return false;
    }
}
