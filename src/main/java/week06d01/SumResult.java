package week06d01;

public class SumResult {

    private double negativeSum;
    private double positiveSum;

    public SumResult(double negativeSum, double positiveSum) {
        this.negativeSum = negativeSum;
        this.positiveSum = positiveSum;
    }

    public double getNegativeSum() {
        return negativeSum;
    }

    public double getPositiveSum() {
        return positiveSum;
    }
}
