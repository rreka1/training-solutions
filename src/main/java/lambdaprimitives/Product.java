package lambdaprimitives;

public class Product {

    private final String name;
    private final double price;
    private final int number;

    public Product(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}
