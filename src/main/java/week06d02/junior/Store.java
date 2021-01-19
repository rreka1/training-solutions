package week06d02.junior;

import java.util.List;

public class Store {

    List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category) {
        int numberOfProducts = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                numberOfProducts++;
            }
        }
        return numberOfProducts;
    }
}
