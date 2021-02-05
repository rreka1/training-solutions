package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] byteMatrix, Path folder) {
        Path file = folder.resolve("image.png");
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (byte[] part : byteMatrix) {
                outputStream.write(part);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
