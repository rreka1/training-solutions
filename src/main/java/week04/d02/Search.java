package week04.d02;

/*
 * A Search osztályban írj egy getIndexesOfChar() metódust,
 * mely első paraméterként vár egy String értéket, második paraméterként egy char értéket!
 * Visszaad egy listát, melyben visszaadja,
 * hogy a karakter hanyadik indexeken szerepel az első paraméterként átadott listában.
 * Pl.: almafa szóban a a karakter: 0, 3, 5.
 * */

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String text, char character) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (character == text.charAt(i)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        System.out.println(new Search().getIndexesOfChar("almafa", 'a'));
    }
}
