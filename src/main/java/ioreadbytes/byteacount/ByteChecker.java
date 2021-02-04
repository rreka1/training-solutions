package ioreadbytes.byteacount;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        int result = 0;
        Path file = Path.of(fileName);
        try (InputStream inputStream = Files.newInputStream(file)) {
            byte[] bytes = new byte[1000];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                for (int i = 0; i < size; i++) {
                    if (bytes[i] == (byte) 'a') {
                        result++;
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("can not read file", ioe);
        }
        return result;
    }
}


