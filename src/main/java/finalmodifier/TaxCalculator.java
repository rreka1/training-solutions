package finalmodifier;

public class TaxCalculator {

    public static final double ÁFA = 0.27;

    public double tax(double price) {
        return price * ÁFA;
    }

    public double priceWithTax(double price) {
        return price * (1 + ÁFA);
    }

    public static void main(String[] args) {

        TaxCalculator taxcalc = new TaxCalculator();
        System.out.println("" + taxcalc.tax(127_000));
        System.out.println("" + taxcalc.priceWithTax(100_000));
    }
}
