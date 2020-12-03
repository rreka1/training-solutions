package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > lower && values[i] < upper) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public double maximum() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
