package week05.d03;

/*
 * Junior
 * Írj egy olyan metódust a ListCounter osztályban,
 * mely a kapott String listából összeszámolja azokat, amelyek a nagy A betűvel kezdődnek!
 * Ha nulla elemű a tömb, vagy nincs benne ilyen elem, akkor nulla értéket adjon vissza!
 * */

import java.util.Arrays;
import java.util.List;

public class ListCounter {

    public int countPrefixA(List<String> strings) {
        int sum = 0;
        for (String string : strings) {
            if (string.charAt(0) == 'A') {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Almafa", "almafa", "Autó", "sjhdf", "djh", " ", "A", "Ab");
        System.out.println(new ListCounter().countPrefixA(strings));
    }
}
