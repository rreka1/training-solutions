package week13d05.junior;

import java.util.Set;
import java.util.TreeSet;

public class CharCounter {

    public int differentCharsInWord(String word) {
        String lowercaseWord = word.toLowerCase();
        Set<Character> charSet = new TreeSet<>();
        for (int i = 0; i < lowercaseWord.length(); i++) {
            if ((lowercaseWord.charAt(i) >= 'a') && (lowercaseWord.charAt(i) <= 'z')) {
                charSet.add(lowercaseWord.charAt(i));
            }
        }
        System.out.println(charSet);
        return charSet.size();
    }

    public static void main(String[] args) {
        CharCounter charCounter = new CharCounter();
        int result = charCounter.differentCharsInWord("apple");
        System.out.println(result);
    }
}
