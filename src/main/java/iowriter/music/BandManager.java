package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path inputFile) {
        try (BufferedReader br = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0];
                int year = Integer.parseInt(parts[1]);
                bands.add(new Band(name, year));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void writeBandsBefore(Path outputFile, int year) {
        try (BufferedWriter bw = Files.newBufferedWriter(outputFile)) {
            List<Band> result = findBandsBefore(year);
            for (Band band : result) {
                bw.write(band.getName() + " " + band.getYear() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private List<Band> findBandsBefore(int year) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands) {
            if (band.getYear() < year) {
                result.add(band);
            }
        }
        return result;
    }
}
