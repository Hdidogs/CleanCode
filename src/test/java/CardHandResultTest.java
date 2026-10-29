import card.Cards;
import card.Hand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardHandResultTest {
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

    @Test
    public void shouldHaveBrelanFalse() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DIX_COUEUR).addCard(Cards.ROI_PIQUE).addCard(Cards.QUATTRE_TREFLE);
        assertFalse(hand.hasBrelan());
    }

    @Test
    public void shouldHaveBrelanTrue() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE);
        assertTrue(hand.hasBrelan());
    }

    @Test
    public void shouldHaveCouleurFalse() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DIX_COUEUR).addCard(Cards.ROI_PIQUE).addCard(Cards.QUATTRE_TREFLE);
        assertFalse(hand.hasCouleur());
    }

    @Test
    public void shouldHaveCouleurTrue() {
        Hand hand = new Hand().addCard(Cards.SEPT_PIQUE).addCard(Cards.AS_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE);
        assertTrue(hand.hasCouleur());
    }

    @Test
    public void shouldHaveCarreFalse() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DIX_COUEUR).addCard(Cards.ROI_PIQUE).addCard(Cards.QUATTRE_TREFLE);
        assertFalse(hand.hasCouleur());
    }

    @Test
    public void shouldHaveCarreTrue() {
        Hand hand = new Hand().addCard(Cards.SEPT_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE);
        assertTrue(hand.hasCouleur());
    }
}
