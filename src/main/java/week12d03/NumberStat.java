package week12d03;

/* Junior
 * Készítsd el a week12d03.NumberStat osztályt,
 * melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló listát.
 * Add vissza azt a számot amelyik pontosan egyszer szerepel a listában.
 * Ha több ilyen szám van akkor a kisebbet!
 * Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű,
 * ha a lista nem ilyen, dobj kivételt!
 * pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
 * Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma.
 * A fent megírt metódus ezen a listán dolgozzon.
 * A lista elemeit fájlból töltsük fel.
 * A file úgy néz ki, hogy egy sorban három szám van vesszővel elválasztva.
 * Tehát:
 * 1,1,4
 * 2,3,5
 * 2,2,5
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    List<Integer> numbers = new ArrayList<>();

    //1.
    public int findNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List of numbers must not be empty or null!");
        }
        Object[] nums = numbers.toArray();
        Arrays.sort(nums);
        int db = 0;
        for (int i = 0; i < nums.length; i = i + db) {
            db = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i].equals(nums[j])) {
                    db++;
                }
            }
            if (db == 1) {
                return (int) nums[i];
            }
        }
        throw new IllegalArgumentException("There's no unique number!");
    }

    //2.
    public int findSmallestUnique() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Empty list!");
        }
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        if (sortedNumbers.get(0) != sortedNumbers.get(1)) {
            return sortedNumbers.get(0);
        }
        for (int i = 1; i < sortedNumbers.size() - 1; i++) {
            if (sortedNumbers.get(i - 1) != sortedNumbers.get(i) &&
                    sortedNumbers.get(i + 1) != sortedNumbers.get(i)) {
                return sortedNumbers.get(i);
            }
        }
        if (sortedNumbers.get(sortedNumbers.size() - 1) != sortedNumbers.get(sortedNumbers.size() - 2)) {
            return sortedNumbers.get(sortedNumbers.size() - 1);
        }
        throw new IllegalStateException("Wrong list!");
    }

    public void readFromFile(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                addLine(temp);
            }
        } catch (NoSuchFileException nsfe) {
            throw new IllegalArgumentException("Cannot find file!");
        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong!", ioe);
        }
    }

    private void addLine(String[] temp) {
        for (String s : temp) {
            numbers.add(Integer.parseInt(s));
        }
    }

    public static void main(String[] args) {
        //1.
        System.out.println(new NumberStat().findNumber(List.of(1, 1, 5, 3, 4, 5, 6, 5, 6, 4, 1, 6, 5, 4)));
        System.out.println(new NumberStat().findNumber(List.of(1, 1, 5, 3, 3, 5, 6, 5, 6, 1, 6, 5, 4)));
        //2.
        NumberStat ns = new NumberStat();
        ns.readFromFile("week12d03_file.txt");
        System.out.println(ns.findSmallestUnique());
    }
}
