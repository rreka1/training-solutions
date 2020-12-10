package week07d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    @Test
    public void testCalculateSum() {
        assertEquals(1120, new ShoppingList().calculateSum("src/main/java/week07d04/shoppinglist.txt"));
    }
}
