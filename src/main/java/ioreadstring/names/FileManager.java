package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileName) {
        this.myFile = Path.of(fileName);
    }

    public Path getMyFile() {
        return myFile;
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public void readFromFile() {
        try {
            List<String> lines = Files.readAllLines(myFile);
            for (String line : lines) {
                String[] name = line.split(" ");
                Human human = new Human(name[0], name[1]);
                humans.add(human);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
