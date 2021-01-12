package exceptions.polinom;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientsStr) {
        if (coefficientsStr == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
        double[] coefficients = new double[coefficientsStr.length];
        for (int i = 0; i < coefficientsStr.length; i++) {
            try {
                coefficients[i] = Double.parseDouble(coefficientsStr[i]);
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
            }
        }
        this.coefficients = coefficients;
    }

    public double evaluate(double x) {
        int n = coefficients.length - 1;
        double sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += coefficients[i] * Math.pow(x, (double) n - i);
        }
        return sum;
    }

    public double[] getCoefficients() {
        return coefficients;
    }
}
