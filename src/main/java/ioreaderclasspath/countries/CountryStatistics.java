package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public void readFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream("/" + fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int numOfBorders = Integer.parseInt(parts[1]);
                countryList.add(new Country(name, numOfBorders));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int numberOFCountries() {
        return countryList.size();
    }

    public Country mostBorderCountries() {
        Country mostBorderCountry = countryList.get(0);
        for (Country country : countryList) {
            if (country.getBorderCountries() > mostBorderCountry.getBorderCountries()) {
                mostBorderCountry = country;
            }
        }
        return mostBorderCountry;
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }
}
