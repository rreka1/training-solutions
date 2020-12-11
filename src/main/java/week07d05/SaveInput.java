package week07d05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveInput {

    private Scanner scanner;

    //Dependency Injection
    public SaveInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> readLines() {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ": ");
            String line = scanner.nextLine();
            lines.add(line);
        }
        return lines;
    }

    public Path readFilename() {
        System.out.println("Filename: ");
        String filename = scanner.nextLine();
        Path path = Path.of(filename);
        return path;
    }

    public void write(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write!", ioe);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SaveInput saveInput = new SaveInput(scanner);
        List<String> lines = saveInput.readLines();
        Path file = saveInput.readFilename();
        saveInput.write(file, lines);
    }

    /*
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
    */
}
