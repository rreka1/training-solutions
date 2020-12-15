package week08d02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();
    public static final Path INPUT = Path.of("countries.txt");

    public List<Country> getCountries() {
        return List.copyOf(countries);
    }

    public Country maxPopulation() {
        read();
        Country c = null;
        for (Country country : countries) {
            if (c == null || country.getPopulation() > c.getPopulation()) {
                c = country;
            }
        }
        return c;
    }

    private void read() {
        List<String> input;
        try {
            input = Files.readAllLines(INPUT, StandardCharsets.UTF_8);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file! ", ioe);
        }
        convert(input);
    }

    private void convert(List<String> input) {
        for (String line : input) {
            String[] parts = line.split(" ");
            String countryName = parts[0];
            int population = Integer.parseInt(parts[1]);
            int numOfColors = Integer.parseInt(parts[2]);
            int numOfNeighbours = Integer.parseInt(parts[3]);
            countries.add(new Country(countryName, population, numOfColors, numOfNeighbours));
        }
    }
}
