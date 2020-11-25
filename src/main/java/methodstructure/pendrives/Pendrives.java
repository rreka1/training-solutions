package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive best = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (best.comparePricePerCapacity(pendrives.get(i)) == 1) {
                best = pendrives.get(i);
            }
        }
        return best;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = null;
        for (Pendrive pendrive : pendrives) {
            if (cheapest == null || pendrive.cheaperThan(cheapest)) {
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive : pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
