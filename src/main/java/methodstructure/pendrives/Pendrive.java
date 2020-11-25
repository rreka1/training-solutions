package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        this.price += this.price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other) {
        double a = (double) this.price / this.capacity;
        double b = (double) other.price / other.capacity;
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean cheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Név: ").append(name).append(", ");
        sb.append("Kapacitás: ").append(capacity).append("GB, ");
        sb.append("Ár: ").append(price).append(" Ft");
        return sb.toString();
    }
}
