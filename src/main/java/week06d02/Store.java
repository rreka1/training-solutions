package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<NumberOfProducts> getProductsByCategory() {
        List<NumberOfProducts> result = new ArrayList<>();
        int count = 0;
        for (Category category : Category.values()) {
            for (Product product : products) {
                if (product.getCategory() == category) {
                    count++;
                }
            }
            result.add(new NumberOfProducts(category, count));
            count = 0;
        }
        return result;
    }
}
