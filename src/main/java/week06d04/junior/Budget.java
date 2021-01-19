package week06d04.junior;

/* Junior
 * Készíts az egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
 * Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name.
 * A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items listát.
 * Írj egy metódust, getItemsByMonth néven, mely egy hónapot vár (1-12)
 * és visszaadja az Item-eket az adott hónapban!
 * Bónusz feladat: ellenőrizzük a bemeneti paramétereket!
 * */

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {
        if (month < 1 && month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        List<Item> itemsInMonth = new ArrayList<>();
        for (Item item : items) {
            if (item.getMonth() == month) {
                itemsInMonth.add(item);
            }
        }
        return itemsInMonth;
    }
}
