package week07d05;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaveInputTest {

    @Test
    void testReadLines() {
        Scanner scanner = new Scanner("aaa\nbbb\nccc");
        SaveInput saveInput = new SaveInput(scanner);
        List<String> lines = saveInput.readLines();
        assertEquals(List.of("aaa", "bbb", "ccc"), lines);
    }
}
