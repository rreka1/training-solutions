package week13d01.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class City {

    public String findCityWithMaxLength(BufferedReader bufferedReader) {
        try {
            return findCity(bufferedReader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }
    }

    private void skipHeader(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
    }

    private String getNameFromLine(String line, int number) {
        String[] parts = line.split(";");
        if (parts.length <= 1) {
            throw new IllegalArgumentException("Illegal line: " + number + ": " + line);
        }
        String name = parts[1];
        return name;
    }

    private String findCity(BufferedReader bufferedReader) throws IOException {
        String maxCityName = "";
        int number = 0;
        String line;
        skipHeader(bufferedReader);
        number++;
        while ((line = bufferedReader.readLine()) != null) {
            number++;
            String name = getNameFromLine(line, number);
            if (name.length() > maxCityName.length()) {
                maxCityName = name;
            }
        }
        if (maxCityName.equals("")) {
            throw new IllegalArgumentException("No city found");
        }
        return maxCityName;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("iranyitoszamok-varosok-2021.csv"))) {
            String city = new City().findCityWithMaxLength(bufferedReader);
            System.out.println(city);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
