package week12d05.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HtmlWordCounter {

    public int wordCounter(String word, BufferedReader bufferedReader) {
        try {
            String line;
            int counter = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            }
            return counter;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public static void main(String[] args) {
        HtmlWordCounter htmlWordCounter = new HtmlWordCounter();
        Path path = Path.of("src/main/resources/index.html");
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            System.out.println(htmlWordCounter.wordCounter("covid", reader));

            reader = Files.newBufferedReader(path);
            System.out.println(htmlWordCounter.wordCounter("koronavírus", reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
