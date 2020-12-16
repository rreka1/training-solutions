package week08d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void testShortestWords() {
        StringLists sl = new StringLists();
        List<String> words = List.of("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(List.of("aa", "bb", "dd"), sl.shortestWords(words));
    }
}
