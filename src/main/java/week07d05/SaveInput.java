package week07d05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveInput {

    public static final Path OUTPUT = Path.of("src/main/java/week07d05/output.txt");
    List<String> inputLines = new ArrayList<>();

    public void readLines(int numOfLines) {
        if (numOfLines < 1) {
            throw new IllegalArgumentException();
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfLines; i++) {
            inputLines.add(scanner.nextLine());
        }
    }

    public void writeLines() {
        try (BufferedWriter bw = Files.newBufferedWriter(OUTPUT)) {
            for (String line : inputLines) {
                bw.write(line);
                bw.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!", ioe);
        }
    }

    public static void main(String[] args) {
        SaveInput saveInput = new SaveInput();
        saveInput.readLines(3);
        saveInput.writeLines();
    }
}
