package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

    //...
    public void install(String targetDirectoryName) {
        Path path = Path.of(targetDirectoryName);
        if (!Files.exists(path) || !Files.isDirectory(path)) {
            throw new IllegalArgumentException("The given directory doesn't exist");
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(Installer.class.getResourceAsStream("/install/install.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.endsWith("/")) {
                    Files.createDirectories(path.resolve(line));
                } else {
                    Files.copy(Installer.class.getResourceAsStream(
                            "/install/" + line),
                            path.resolve(line),
                            StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not copy files", ioe);
        }
    }
}
