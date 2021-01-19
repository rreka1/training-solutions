package week05.d04.junior;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getNumberOfExpired() {
        int numberOfExpired = 0;
        for (Product product : products) {
            if (product.getExpireDate().isBefore(LocalDate.now())) {
                numberOfExpired++;
            }
        }
        return numberOfExpired;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("a", 2020, 11, 2));
        store.addProduct(new Product("b", 2022, 3, 5));
        store.addProduct(new Product("c", 2019, 6, 2));
        store.addProduct(new Product("d", 2021, 12, 31));

        System.out.println(store.getProducts());
        System.out.println(store.getNumberOfExpired());
    }
}
