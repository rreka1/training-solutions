package lambdacomparator;

public class CloudStorage implements Comparable<CloudStorage> {

    private final String provider;
    private final int space;
    private PayPeriod period;
    private double price;

    public CloudStorage(String provider, int space, PayPeriod period, double price) {
        this.provider = provider;
        this.space = space;
        this.period = period;
        this.price = price;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(CloudStorage o) {
        double currentValue = 0;
        if (this.period != null) {
            currentValue = this.price * 12 / this.period.getLength() / this.space * 1000;
        }
        double otherValue = 0;
        if (o.period != null) {
            otherValue = o.price * 12 / o.period.getLength() / o.space * 1000;
        }
        return Double.compare(currentValue, otherValue);
    }
}
