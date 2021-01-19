package week06d02.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {

    @Test
    void getProductByCategoryName() {
        List<Product> products = List.of(
                new Product("a", Category.DAIRY, 100),
                new Product("b", Category.DAIRY, 100),
                new Product("c", Category.BAKEDGOODS, 100),
                new Product("d", Category.FROZEN, 100),
                new Product("e", Category.DAIRY, 100)
        );
        Store store = new Store(products);
        assertEquals(1, store.getProductByCategoryName(Category.FROZEN));
        assertEquals(3, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(1, store.getProductByCategoryName(Category.BAKEDGOODS));
        assertEquals(0, store.getProductByCategoryName(Category.OTHER));
    }
}