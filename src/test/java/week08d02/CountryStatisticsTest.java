package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryStatisticsTest {

    @Test
    public void readFromFile() {
        CountryStatistics cs = new CountryStatistics();
        cs.maxPopulation();
        assertEquals(11, cs.getCountries().size());
    }

    @Test
    public void maxPopulationTest() {
        CountryStatistics cs = new CountryStatistics();
        assertEquals("Kongoi_Demokratikus_Koztarsasag - population: 79 - colors: 3 - neighbours: 9", cs.maxPopulation().toString());
    }
}
