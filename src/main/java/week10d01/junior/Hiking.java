package week10d01.junior;

import java.util.List;

public class Hiking {

    public double getPlusElevations(List<Double> elevations) {
        double sum = 0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            double actual = elevations.get(i);
            double next = elevations.get(i + 1);
            if (actual < next) {
                sum += next - actual;
            }
        }
        return sum;
    }
}
