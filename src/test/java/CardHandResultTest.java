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
        assertFalse(hand.hasCarre());
    }

    @Test
    public void shouldHaveCarreTrue() {
        Hand hand = new Hand().addCard(Cards.SEPT_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE).addCard(Cards.ROI_PIQUE);
        assertTrue(hand.hasCarre());
    }

    @Test
    public void shouldHaveSuiteFalse() {
        Hand hand = new Hand().addCard(Cards.AS_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DIX_COUEUR).addCard(Cards.ROI_PIQUE).addCard(Cards.QUATTRE_TREFLE);
        assertFalse(hand.hasSuite());
    }

    @Test
    public void shouldHaveSuiteTrue() {
        Hand hand = new Hand().addCard(Cards.DEUX_CARRE).addCard(Cards.TROIS_PIQUE).addCard(Cards.CINQ_CARRE).addCard(Cards.QUATTRE_TREFLE).addCard(Cards.SIX_TREFLE);
        assertTrue(hand.hasSuite());
    }

    @Test
    public void shouldHaveQuinteFlushFalse() {
        Hand hand = new Hand().addCard(Cards.DEUX_CARRE).addCard(Cards.TROIS_PIQUE).addCard(Cards.CINQ_CARRE).addCard(Cards.QUATTRE_TREFLE).addCard(Cards.SIX_TREFLE);
        assertFalse(hand.hasQuinteFlush());
    }

    @Test
    public void shouldHaveQuinteFlushTrue() {
        Hand hand = new Hand().addCard(Cards.DEUX_CARRE).addCard(Cards.TROIS_CARRE).addCard(Cards.CINQ_CARRE).addCard(Cards.QUATTRE_CARRE).addCard(Cards.SIX_CARRE);
        assertTrue(hand.hasQuinteFlush());
    }

    @Test
    public void shouldHaveFullFalse() {
        Hand hand = new Hand().addCard(Cards.DEUX_CARRE).addCard(Cards.TROIS_PIQUE).addCard(Cards.CINQ_CARRE).addCard(Cards.QUATTRE_TREFLE).addCard(Cards.SIX_TREFLE);
        assertFalse(hand.hasCarre());
    }

    @Test
    public void shouldHaveFullTrue() {
        Hand hand = new Hand().addCard(Cards.DEUX_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.DEUX_CARRE).addCard(Cards.QUATTRE_CARRE).addCard(Cards.QUATTRE_CARRE);
        assertTrue(hand.hasCarre());
    }
}
