package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        List<String> shortestWords = new ArrayList<>();
        int minLength = findShortestLength(words);
        for (String word : words) {
            if (word.length() == minLength) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    private int findShortestLength(List<String> words) {
        int minLength = words.get(0).length();
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }
        return minLength;
    }
}
