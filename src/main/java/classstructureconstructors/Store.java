package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int stock) {
        this.stock += stock;
    }

    public void dispatch(int dispatched) {
        this.stock -= dispatched;
    }

}
