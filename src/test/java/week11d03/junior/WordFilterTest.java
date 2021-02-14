package week11d03.junior;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        WordFilter wf = new WordFilter();
        List<String> words = List.of("alma", "körte", "barack");
        List<String> result = wf.wordsWithChar(words, 'a');
        assertEquals(Arrays.asList("alma", "barack"), result);
    }

    @Test
    void wordsWithCharEmpty() {
        WordFilter wf = new WordFilter();
        List<String> words = List.of("alma", "körte", "barack");
        List<String> result = wf.wordsWithChar(words, 'z');
        assertEquals(0, result.size());
    }
}