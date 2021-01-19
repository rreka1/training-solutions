package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordEraserTest {

    @Test
    void eraseWord() {
        String text = "alma körte alma alma körte körte alma";
        String word = "alma";
        assertEquals("körte körte körte", new WordEraser().eraseWord(text, word));
    }
}