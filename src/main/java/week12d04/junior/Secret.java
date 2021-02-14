package week12d04.junior;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {

    //1.
    public void decodeBinaryFile(String filename) {
        Path path = Path.of(filename);
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (int i = 0; i < bytes.length; i++) {
                char c = (char) (bytes[i] + 10);
                System.out.print(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    //2.
    public void decodeBinaryFile2(String filename) {
        Path path = Path.of(filename);
        try (InputStream is = Files.newInputStream(path)) {
            byte[] buffer = new byte[1000];
            int size;
            while ((size = is.read(buffer)) > 0) {
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    System.out.print(c);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public static void main(String[] args) {
        new Secret().decodeBinaryFile("secret.dat");
        new Secret().decodeBinaryFile2("secret.dat");
    }
}
