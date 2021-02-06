package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream outputStream, List<String> shoppingList) {
        try (OutputStreamWriter osw = new OutputStreamWriter(outputStream)) {
            for (String item : shoppingList) {
                osw.write(item + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public List<String> loadShoppingList(InputStream inputStream) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader isr = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = isr.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
