import card.Cards;
import card.Hand;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardResultTest {
    @org.junit.jupiter.api.Test
    public void shouldHandContainOnly5Cards() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.AS_CARRE).addCard(Cards.AS_CARRE).addCard(Cards.AS_CARRE).addCard(Cards.AS_CARRE);
        assertEquals(5, hand.addCard(Cards.AS_COUEUR));
    }
}
