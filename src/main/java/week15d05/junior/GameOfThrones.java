package week15d05.junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameOfThrones {

    public String getHouse(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine(); //skip header
        String line;
        Map<String, Integer> numberOfBattles = new HashMap<>();
        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
            List<String> houses = getHousesFromLine(line);
            //System.out.println(houses);
            countHouses(numberOfBattles, houses);
        }
        //System.out.println(numberOfBattles);
        String house = getMax(numberOfBattles);
        return house;
    }

    private String getMax(Map<String, Integer> numberOfBattles) {
        int max = 0;
        String house = null;
        for (Map.Entry<String, Integer> entry : numberOfBattles.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                house = entry.getKey();
            }
        }
        return house;
    }

    private void countHouses(Map<String, Integer> numberOfBattles, List<String> houses) {
        for (String house : houses) {
            if (numberOfBattles.containsKey(house)) {
                numberOfBattles.put(house, numberOfBattles.get(house) + 1);
            } else {
                numberOfBattles.put(house, 1);
            }
        }
    }

    private List<String> getHousesFromLine(String line) {
        String[] parts = line.split(",");
        List<String> houses = new ArrayList<>();
        for (int i = 5; i < 12; i++) {
            if (!parts[i].isBlank()) {
                houses.add(parts[i]);
            }
        }
        return houses;
    }

    public static void main(String[] args) {
        Path path = Path.of("battles.csv");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String house = new GameOfThrones().getHouse(bufferedReader);
            System.out.println(house);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
