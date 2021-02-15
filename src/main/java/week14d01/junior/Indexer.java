package week14d01.junior;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> result = new TreeMap<>();
        for (String name : names) {
            char index = name.charAt(0);
            if (!result.containsKey(index)) {
                result.put(index, new ArrayList<>());
            }
            result.get(index).add(name);
        }
        return result;
    }

    public static void main(String[] args) {
        Indexer indexer = new Indexer();
        List<String> names = List.of("Odon", "Lujza", "Abraham", "Magdolna", "Lajos", "Mária", "Béla", "Zoltán");
        Map<Character, List<String>> result = indexer.index(names);
        System.out.println(result);
    }
}
