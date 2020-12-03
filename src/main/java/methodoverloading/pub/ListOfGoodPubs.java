package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {

    List<Pub> goodPubs = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (goodPubs == null || goodPubs.isEmpty()) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest() {
        Pub best = null;
        for (Pub pub : goodPubs) {
            if (best == null || pub.getOpenFrom().isEarlier(best.getOpenFrom())) {
                best = pub;
            }
        }
        return best;
    }
}
