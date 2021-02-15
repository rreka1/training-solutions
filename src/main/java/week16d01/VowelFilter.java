package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {

    private static final String VOWELS = "aAeEiIoOuU";

    public String filterVowels(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(filter(line)).append("\n");
        }
        return sb.toString();
    }

    private String filter(String word) {
        /*for (int i = 0; i < VOWELS.length(); i++) {
            char actualVowel = VOWELS.charAt(i);
            if (word.contains(Character.toString(actualVowel))) {
                word = word.replace(actualVowel, '\255');
            }
        }
        return word;*/
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!VOWELS.contains(Character.toString(word.charAt(i)))) {
                result += word.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        VowelFilter vowelFilter = new VowelFilter();
        String fileName = "vowelfilter_input.txt";
        Path path = Path.of(fileName);
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String result = vowelFilter.filterVowels(bufferedReader);
            System.out.println(result);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file: " + fileName, ioe);
        }
    }
}
