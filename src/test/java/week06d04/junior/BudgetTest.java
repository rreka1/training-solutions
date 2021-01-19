package week06d04.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BudgetTest {

    @Test
    void getItemsByMonth() {
        List<Item> items = List.of(
                new Item("a", 100, 1),
                new Item("b", 100, 2),
                new Item("c", 100, 2),
                new Item("d", 100, 3),
                new Item("e", 100, 11),
                new Item("f", 100, 2)
        );
        Budget budget = new Budget(items);
        List<Item> result1 = budget.getItemsByMonth(2);
        List<Item> result2 = budget.getItemsByMonth(11);
        assertEquals(3, result1.size());
        assertEquals(1, result2.size());
    }
}