package week06d04;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(String name, int quantity) {
        Item item = findItemByName(name);
        if (item == null) {
            items.add(new Item(name, quantity));
        } else {
            item.addQuantity(quantity);
        }
    }

    public int getItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item.getQuantity();
            }
        }
        return 0;
    }

    private Item findItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
