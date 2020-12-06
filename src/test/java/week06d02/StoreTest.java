package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void testGetProductsByCategory() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("bread", Category.BAKEDGOODS, 100));
        products.add(new Product("milk", Category.DAIRY, 100));
        products.add(new Product("ice cream", Category.FROZEN, 100));
        products.add(new Product("cheese", Category.DAIRY, 100));
        products.add(new Product("coffee", Category.OTHER, 100));
        products.add(new Product("apple", Category.OTHER, 100));
        products.add(new Product("tea", Category.OTHER, 100));

        Store store = new Store(products);

        assertEquals("[FROZEN: 1, DAIRY: 2, BAKEDGOODS: 1, OTHER: 3]", store.getProductsByCategory().toString());
    }
}
