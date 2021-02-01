package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path fileName, int mark) {
        try {
            if (Files.exists(fileName)) {
                Files.writeString(fileName, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(fileName, Integer.toString(mark));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not open file", ioe);
        }
    }

    public void average(Path fileName) {
        double sumOfMarks = 0.0;
        try {
            List<String> lines = Files.readAllLines(fileName);
            for (String line : lines) {
                sumOfMarks += Double.parseDouble(line);
            }
            double average = sumOfMarks / lines.size();
            Files.writeString(fileName, "average: " + average, StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file");
        }
    }
}
