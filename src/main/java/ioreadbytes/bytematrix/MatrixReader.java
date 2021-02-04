package ioreadbytes.bytematrix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    private List<byte[]> myMatrix = new ArrayList<>();

    public void readBytesAndCreateMatrix(String fileName) {
        Path file = Path.of(fileName);
        try (InputStream inputStream = Files.newInputStream(file)) {
            int size;
            byte[] bytes = new byte[1000];
            while ((size = inputStream.read(bytes)) > 0) {
                myMatrix.add(bytes);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("can not read file", ioe);
        }
    }

    public int numberOfColumnsWhereMoreZeros() {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            int numOf0 = 0;
            int numOf1 = 0;
            for (int j = 0; j < myMatrix.size(); j++) {
                if (myMatrix.get(j)[i] == 48) {
                    numOf0++;
                } else {
                    numOf1++;
                }
            }
            if (numOf0 > numOf1) {
                result++;
            }
        }
        return result;
    }

    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(myMatrix);
    }
}
