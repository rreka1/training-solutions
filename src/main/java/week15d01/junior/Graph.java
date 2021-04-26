package week15d01.junior;

import java.util.Map;

public class Graph {

    public Map.Entry<Double, Double> maxEntry(Map<Double, Double> graphPoints) {
        Map.Entry<Double, Double> result = null;
        double max = Double.MIN_VALUE;
        for (Map.Entry<Double, Double> point : graphPoints.entrySet()) {
            if (max < point.getValue()) {
                max = point.getValue();
                result = point;
            }
        }
        return result;
    }
}
