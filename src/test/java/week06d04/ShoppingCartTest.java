package week06d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    void itemNotExists() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Bread", 5);
        assertEquals(5, cart.getItem("Bread"));
    }

    @Test
    void itemExists() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Bread", 5);
        cart.addItem("Bread", 3);
        assertEquals(8, cart.getItem("Bread"));
    }

    @Test
    void moreItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Bread", 5);
        cart.addItem("Milk", 3);
        assertEquals(5, cart.getItem("Bread"));
        assertEquals(3, cart.getItem("Milk"));
    }
}
