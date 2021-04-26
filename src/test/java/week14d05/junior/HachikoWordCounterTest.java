package week14d05.junior;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HachikoWordCounterTest {

    @Test
    void countWords() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.srt"), Charset.forName("windows-1250"))) {
            Map<String, Integer> result = new HachikoWordCounter().countWords(reader, "Hachiko", "haza", "pályaudvar", "jó");
            assertEquals(16, result.get("haza"));
        }
    }
}