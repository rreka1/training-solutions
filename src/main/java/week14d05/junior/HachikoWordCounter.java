package week14d05.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class HachikoWordCounter {

    public Map<String, Integer> countWords(BufferedReader reader, String... words) {
        try {
            return processLines(reader, words);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read line!", ioe);
        }
    }

    public Map<String, Integer> processLines(BufferedReader reader, String... words) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            countWordsInLine(line, result, words);
        }
        return result;
    }

    private void countWordsInLine(String line, Map<String, Integer> result, String... words) {
        for (String word : words) {
            if (line.toLowerCase().contains(word.toLowerCase())) {
                incrementCounter(result, word);
            }
        }
    }

    private void incrementCounter(Map<String, Integer> result, String word) {
        if (!result.containsKey(word)) {
            result.put(word, 1);
        } else {
            Integer prevValue = result.get(word);
            result.put(word, prevValue + 1);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.srt"), Charset.forName("windows-1250"))) {
            System.out.println(new HachikoWordCounter().countWords(reader, "Hachiko", "haza", "pályaudvar", "jó"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
