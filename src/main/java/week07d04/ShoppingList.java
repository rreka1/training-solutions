package week07d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ShoppingList {

    public long calculateSum(String path) {
        Path file = Path.of(path);
        List<String> shoppingList = null;
        try {
            shoppingList = Files.readAllLines(file);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        long sum = 0;
        for (String item : shoppingList) {
            String[] separated = item.split(";");
            int price = Integer.parseInt(separated[1]) * Integer.parseInt(separated[2]);
            sum += price;
        }
        return sum;
    }
}
