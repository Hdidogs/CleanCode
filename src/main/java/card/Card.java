package card;

public class Card {
    private int value;
    private CardType type;

    public Card(int value, CardType type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public CardType getType() {
        return type;
    }
}
