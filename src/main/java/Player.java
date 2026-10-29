import card.Hand;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Hand> hands = new ArrayList<>();

    public Player(List<Hand> hands) {
        this.hands = hands;
    }

    public int getFinalScore() {
        int res = 0;

        for (Hand hand : hands) {
            res += hand.getPoints();
        }

        return res;
    }
}
