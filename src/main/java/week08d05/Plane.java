package week08d05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Plane {

    public int flyOverMapWithMaxOcean(String path) {
        int max = 0;
        try (FileInputStream fis = new FileInputStream(path)) {
            int input;
            int counter = 0;
            while ((input = fis.read()) != -1) {
                if (input == 48) {
                    counter++;
                } else {
                    if (max < counter) {
                        max = counter;
                    }
                    counter = 0;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO fail");
        }
        return max;
    }

    /*
    String map = "10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011";

    public int findMax() {
        int max = 0;
        int count = 0;
        for (int i = 0; i < map.length(); i++) {
            while (map.charAt(i) == '0') {
                count++;
                i++;
            }
            if (max < count) {
                max = count;
            }
            count = 0;
        }
        return max;
    }
     */
}
