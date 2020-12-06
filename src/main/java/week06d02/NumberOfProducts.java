package week06d02;

public class NumberOfProducts {

    private Category category;
    private int quantity;

    public NumberOfProducts(Category category, int quantity) {
        this.category = category;
        this.quantity = quantity;
    }

    public String toString() {
        return category + ": " + quantity;
    }
}
