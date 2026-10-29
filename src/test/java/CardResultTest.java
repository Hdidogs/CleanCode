import card.Cards;
import card.Hand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardResultTest {
    @Test
    public void shouldHandContainOnly5Cards() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DIX_COUEUR).addCard(Cards.ROI_PIQUE).addCard(Cards.QUATTRE_TREFLE);
        assertEquals(5, hand.addCard(Cards.AS_COUEUR).getCards().size());
    }

    @Test
    public void shouldHandGetMaxValue() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DIX_COUEUR).addCard(Cards.ROI_PIQUE).addCard(Cards.QUATTRE_TREFLE);
        assertEquals(14, hand.getHigherValue());
    }
}
