package week14d02.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OnlineShopping {

    Map<String, TreeSet<String>> orders = new HashMap<>();

    public void readFile(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            saveOrders(line);
        }
    }

    private Map<String, TreeSet<String>> saveOrders(String line) {
        String[] parts = line.split(" ");
        String id = parts[0];
        List<String> itemList = Arrays.asList(parts[1].split(","));
        orders.put(id, new TreeSet<>(itemList));
        return new HashMap<>(orders);
    }

    public TreeSet<String> findItemsById(String id) {
        TreeSet<String> result = orders.get(id);
        return result;
    }

    public int sumSoldItemsByName(String itemName) {
        /*Map<String, Integer> items = getItemsWithNumOfOrders();
        for (Map.Entry item : items.entrySet()) {
            if (item.getKey().equals(itemName)) {
                return (int) item.getValue();
            }
        }*/
        return getItemsWithNumOfOrders().get(itemName);
        //throw new IllegalArgumentException("Product " + itemName + " not found!");
    }

    public Map<String, Integer> getItemsWithNumOfOrders() {
        Map<String, Integer> result = new TreeMap<>();
        for (TreeSet<String> itemsByOrder : orders.values()) {
            for (String item : itemsByOrder) {
                if (!result.containsKey(item)) {
                    result.put(item, 1);
                } else {
                    result.put(item, result.get(item) + 1);
                }
            }
        }
        return result;
    }

    public int numOfItemsByOrder(String idToFind) {
        /*int numOfItems = 0;
        for (String id : orders.keySet()) {
            if (id.equals(idToFind)) {
                numOfItems = orders.get(idToFind).size();
            }
        }
        return numOfItems;*/
        return findItemsById(idToFind).size();
    }

    public static void main(String[] args) {
        OnlineShopping onlineShopping = new OnlineShopping();
        Path path = Path.of("online_shopping.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            //0. Olvasd be a fájlt és tárold el az adatokat a memóriában
            onlineShopping.readFile(bufferedReader);
            System.out.println(onlineShopping.orders);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        //1. Egyedi azonosító alapján legyenek lekérdezhetőek a vásárolt termékek ABC sorrendben.
        System.out.println(onlineShopping.findItemsById("CM231"));
        //2. Számoljuk össze, egy termék neve alapján, hogy abból a termékből mennyit adtak el.
        System.out.println(onlineShopping.sumSoldItemsByName("rosmary"));
        //3. Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.
        System.out.println(onlineShopping.numOfItemsByOrder("CM231"));
        System.out.println(onlineShopping.numOfItemsByOrder("B341"));
        //4. Készíts statisztikát melyben visszaadod, hogy az egyes termékek hányszor szerepelnek a fájlban.
        System.out.println(onlineShopping.getItemsWithNumOfOrders());
    }
}
