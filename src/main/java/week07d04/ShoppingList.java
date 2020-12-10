package week07d04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ShoppingList {

    public static final String LINE_SEPARATOR = ";";
    public static final int INDEX_OF_AMOUNT = 1;
    public static final int INDEX_OF_PRICE = 2;

    public long calculateSum(String path) {
        long sum = 0;
        List<String> shoppingList;
        try {
            shoppingList = Files.readAllLines(Path.of(path), StandardCharsets.UTF_8);
            for (String line : shoppingList) {
                long result = calculateLineSum(line);
                sum += result;
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sum;
    }

    private long calculateLineSum(String line) {
        String[] separated = line.split(LINE_SEPARATOR);
        long amount = Long.parseLong(separated[INDEX_OF_AMOUNT]);
        long price = Long.parseLong(separated[INDEX_OF_PRICE]);
        long result = amount * price;
        return result;
    }
}
